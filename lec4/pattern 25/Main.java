import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nst=1;
        int nsp=4;
        int a=1;
        
        for(int i=1;i<=5;i++)
        { 
          for(int j=1;j<=nsp;j++)
          {
            System.out.print("\t");
          }
          for(int j=1;j<=nst;j++)
          {
            System.out.print(a+"\t");
            a++;
          }
          nst+=2;
          nsp--;
          
          System.out.println();
        }
    }
}