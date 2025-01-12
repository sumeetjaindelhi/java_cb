import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst=0;
        int nsp=3;

        for(int i=1;i<=5;i++)
        {
            if(i==1 || i==5)
            {  
                nst=5;
                for(int j=1;j<=nst;j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {   nst=1;
                for(int j=1;j<=nst;j++)
                {
                    System.out.print("* ");
                }
                for(int j=1;j<=nsp;j++)
                {
                    System.out.print("- ");
                }

                for(int j=1;j<=nst;j++)
                {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }
}