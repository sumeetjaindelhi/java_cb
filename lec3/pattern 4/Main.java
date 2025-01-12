import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst=1;
        int nsp=4;

        for(int i=1;i<5;i++)
        {
            for(int j=nsp;j>0;j--)
            {
                System.out.print("$ ");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }
            nsp--;
            nst++;
            System.out.println();
        }

    }
}