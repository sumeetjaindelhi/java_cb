import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int nsp=9;
        int nst=1;
        
        
        for(int i=1;i<=10;i++)
        {
            int tc=1;
            int a=1;

          for(int j=1;j<=nsp;j++)
          {
            System.out.print("\t");
            tc++;
            if(tc<=9)
                {
                    a++;
                }
            else{
                a--;
            }
          }

          for(int j=1;j<=nst;j++)
          {
            if(tc==10)
            {
                System.out.print("0\t");
            }
            else{
                System.out.print(a+"\t");
            }
            tc++;
            if(tc<=9)
                {
                    a++;
                }
            else{
                a--;
            }
          }
          for(int j=1;j<=nsp;j++)
          {
            System.out.print("\t");
            tc++;
            if(tc<=9)
                {
                    a++;
                }
            else{
                a--;
            }
          }

          nsp-=1;
          nst+=2;
          System.out.println();
        }
    }
}