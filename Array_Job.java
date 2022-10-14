public class Array_Job
{
 public static void main(String[] args)
 {
    Integer a[]={10,500,0,0,3,45,98};
    Integer b[]={25,40,30,10,15,20};
    test(a);
    test(b);

 }

 public static void test(Integer b[])
 {
   Boolean tr=true;
   int j=0;
   while(tr){
      while(j<b.length)
      {
         if(b[j]!=null)
         {
            remove(b);
            j=b.length;      
         }
         else{
            if(j==b.length)
            {
               tr=false;
            }
            else{
               j++;
            }
         }
      }
   }
   while(j<b.length)
   {
      System.out.println(b[j]+"\n");
   }
 }

 public static void remove( Integer a[])
 {
    Integer n=(int)(Math.random()*a.length);
    if(a[n] != null)
        {a[n]= null;}
 }
}

