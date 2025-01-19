import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();
        int ans=0;
        int pow=1;
        while(n!=0)
        {
           int ld=n%10;
           if(ld==0)
           {
            ans+=pow*9;
           }
           else
           {
            ans+=pow*ld;
           }
           n/=10;
           pow*=10;
        }
    System.out.println(ans);

    }
}