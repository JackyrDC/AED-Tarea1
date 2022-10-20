public class Pseudoaleatorios
{
    public static void main(String args[])
    {
        int a,b,cur,n;
            a=12;
            b=5;
            cur=92;
            n=100;
        int i=0;
        while(i<5)
        {            
            int next=(a*cur+b)%n;
            System.out.println(next);
            cur=next;
            i++;
        }
    }
}