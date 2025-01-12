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
            System.out.print(a+"\t");
            nc++;
            if(nc<5)
            {
              a++;
            }
            else
            {
              a--;
            }
          
          }
          nst+=2;
          nsp--;
          a+=2;
          
          System.out.println();
        }
    }
}