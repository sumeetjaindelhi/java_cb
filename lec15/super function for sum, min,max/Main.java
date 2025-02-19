import java.util.*;

class Main{

    public static int[] superfunc(int arr[])
    {
        int min=Integer.MAX_VALUE;  
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        
          if(min>arr[i])
          {
            min=arr[i];
          }

          if(max<arr[i])
          {
            max=arr[i];
          }

          sum+=arr[i];
        
        }

        int sol[]={min,max, sum};
        return  sol;
    }
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        
        int arr[]={1,284,585,42,41,-2,47,36};
        int sol[]=superfunc(arr);

        System.out.println("min is : "+sol[0]);
        System.out.println("max is : "+sol[1]);
        System.out.println("sum is : "+sol[2]);

    }
}