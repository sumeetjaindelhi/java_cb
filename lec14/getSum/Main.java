import java.util.*;

class Main{
public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Size");
        int n=obj.nextInt();

        int [] arr=new int [n];

        System.out.println("Enter data");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Sum is : " +getSum(arr));

    }

    public static int getSum(int [] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }
}