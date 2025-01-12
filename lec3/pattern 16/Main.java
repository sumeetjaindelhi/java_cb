import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst=5;
        int nsp=4;

        for(int i=1;i<=9;i++)
        {

            for(int j=0;j<nsp;j++)
            {
                System.out.print("- ");
            }

            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }
           
           if(i<5){
            nsp--;
            nst--;
           }
           else 
           {
            nsp++;
            nst++;
           }
            
            System.out.println();
        }

    }
}