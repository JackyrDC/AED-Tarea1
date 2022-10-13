public class Random
{
    private static float next;
    public static void main(String[] args) {
        setNext(12,5,92,100);
        System.out.println(next);
    }

    public static void setNext(int a, int b, int cur, int n)
    {
        float ne= (a*cur+b)%n;
        next=ne;
    }
}