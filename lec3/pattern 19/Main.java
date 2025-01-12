import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst=4;
        int nsp=-1;
        for(int i=1;i<=7;i++)
        {
            if(i==1 || i==7)
            {
                for(int j=1;j<=7;j++)
                {
                    System.out.print("* ");
                }
            }

            else 
            {
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

            if(i<4)
            {
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            System.out.println();
        }
    }
}