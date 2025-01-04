import java.util.*;

class Main
{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is biggest");
        }

        else if(b>c)
        {
            System.out.println("B is biggest");
        }

        else 
        {
            System.out.println("C is biggest");
        }
    }
}