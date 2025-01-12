import java.util.*;

class Main{
    public static void main(String Args[])
    {
        Scanner obj=new Scanner(System.in);
        int nsp=4;
        int nst=1;

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("- ");
            }
            for(int j=1;j<=nst;j++)
            { 
                if(j%2==1)
                {
                System.out.print("* ");
                }
                else 
                {
                    System.out.print("! ");
                }
                
            }

            nsp--;
            nst+=2;
            System.out.println();
        }

    }
}