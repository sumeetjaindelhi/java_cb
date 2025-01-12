import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        
        int n=obj.nextInt();
        boolean ans=true;

        for(int i=2;i*i<=n;i++)
        {

            System.out.println("Iteration : "+i);
            if(n%i==0)
            {
               ans=false;
                break;
            }
        }
     if(n==1)
     {
        ans=false;
     }
        
       if(ans)
       {
        System.out.print("prime");
       }
       else
       {
        System.out.print("Not prime");
       }
    }
}