import java.util.*;

class Main{
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);

        int a=obj.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}