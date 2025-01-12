import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst1=5;
        int nsp=-1;
        int nst2=5;
        for(int i=1;i<=5;i++)
        { 
            if(i==1)
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
           if(i==1)
            {
                nst2++;
            }
           nst1--;
           nst2--;
           nsp+=2;
           System.out.println();
        }
    }
}