import java.util.Arrays;

public class Remover {
    public static void main(String args[])
    {

    }

    public static void delete(Object[] Arr)
    {
        boolean vacio=false;
        while(!vacio)
        {
            for (Object object : Arr) {
                if(object==null)
                {
                    vacio=true;
                }
            }
        }
    }
}
