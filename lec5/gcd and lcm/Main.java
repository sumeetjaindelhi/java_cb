import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int on1=n1;
        int on2=n2;
        int rem=0;

        while(n1%n2!=0)
        {
            rem=n1%n2;
            n1=n2;
            n2=rem;
        }

        System.out.println("HCF is : "+n2);

        int lcm=(on1*on2)/n2;

        System.out.println("LCM is : "+lcm);

    }
}