import java.util.Arrays;

public class Remover {
    public static void main(String args[])
    {
        Integer[] Notas={50,25,75,25,36,95,82};
        String[] alumnos={"Juan","Pedro","Maria","Luis","Ana","Jose","Rosa"};
        System.out.println("Notas: ");
        delete(Notas);
        System.out.println("Alumnos: ");
        delete(alumnos);
    }

    public static void delete(Object[] Arr)
    {
        boolean vacio=false;
        while(!vacio)
        {
            for (Object object : Arr) {
                if(object!=null)
                {
                    int index=(int)Math.random()*Arr.length;
                    Arr[index]=null;
                }
            }
        }
        for (Object object : Arr){
            System.out.println(object);
        }
    }
}
