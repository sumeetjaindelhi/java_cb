import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        
        
        for(int i=1;i<=5;i++)
        { 
          int a=5;
          for(int j=1;j<=5;j++)
          {
            if(i+j==6)
            {
                System.out.print("*\t");
            }
            else{
                System.out.print(a+"\t");
            }
            
            a--;
          }
          
          System.out.println();
        }
    }
}