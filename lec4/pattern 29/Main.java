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
          int nc=0;
          
          for(int j=1;j<=nsp;j++)
          {
            System.out.print("\t");
            nc++;
          }
          for(int j=1;j<=nst;j++)
          {
           if(j==1 || j==nst)
           {
            System.out.print(a+"\t");
           } 
           else
           {
            System.out.print("0\t");
           }
          }
          nst+=2;
          nsp--;
          a++;
          
          System.out.println();
        }
    }
}