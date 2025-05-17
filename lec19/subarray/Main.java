import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,4};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            { int sum=0;
               for(int k=i;k<=j;k++)
               {
                sum+=arr[k];
                System.out.print(arr[k]+ " ");
               }
.
               System.out.print("sum is " + sum+" >>>");
            }
            System.out.println();
        }

    }
}