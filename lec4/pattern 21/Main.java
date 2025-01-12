import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst1=1;
        int nsp=7;
        int nst2=1;
        for(int i=1;i<=5;i++)
        { 
            if(i==5)
            {
                nst2--;
            }

           for(int j=1;j<=nst1;j++)
           {
            System.out.print("*\t");
           }
           for(int j=1;j<=nsp;j++)
           {
            System.out.print("\t");
           }
           for(int j=1;j<=nst2;j++)
           {
            System.out.print("*\t");
           }
           nst1++;
           nst2++;
           nsp-=2;
           System.out.println();
        }
    }
}