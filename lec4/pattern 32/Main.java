import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        
        int nsp=1;
        for(int i=1;i<=9;i++)
        { 
          for(int j=1;j<=nsp;j++)
          {
            if(j%2==1)
            {
                System.out.print(i+" ");
            }
            else{
            System.out.print("*"+" ");
            }
          }
          if(i<5)
          {
            nsp+=2;
          }
          else{
            nsp-=2;
          }
          System.out.println();
        }
    }
}