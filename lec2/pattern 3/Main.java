import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}