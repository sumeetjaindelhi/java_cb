import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Digit");
        int n=obj.nextInt();
        int sum=0;

        while(n!=0)
        {
          sum+=n%10;
          n=n/10;
        }

        System.out.println("Sum is : "+sum);

    }
}
