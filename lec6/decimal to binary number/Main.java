import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int pow=1;
        int ans=0;
        while(n!=0)
        {
           int rem=n%2;
           ans+=rem*pow;
           n/=2;
           pow*=10;
        }

        System.out.println(ans);

    }
}