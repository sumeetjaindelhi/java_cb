import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nsp=3;
        int nst=1;
        for(int i=1;i<=7;i++)
        {
            for (int j=1;j<=nsp;j++)
            {
                System.out.print("* ");
            }

            for(int j=1;j<=nst;j++)
            {
                System.out.print("- ");
            }
            for (int j=1;j<=nsp;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
            if(i<=3)
            {
                nst+=2;
                nsp--;
            }
            else 
            {
                nst-=2;
                nsp++;
            }
            

        }

    }
}