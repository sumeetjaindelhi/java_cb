import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("which base you want to convert?");
        int base=obj.nextInt();
        int pow=1;
        int ans=0;
        while(n!=0)
        {
           int rem=n%base;
           ans+=rem*pow;
           n/=base;
           pow*=10;
        }

        System.out.println(ans);

    }
}