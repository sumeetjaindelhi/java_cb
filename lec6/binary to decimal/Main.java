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
            int rem=n%10;
            ans=ans+rem*pow;
            pow*=2;
            n=n/10;

        }

        System.out.println(ans);
        
    }
}