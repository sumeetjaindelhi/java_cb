import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={2,6,38,4,6,8,2,10,5};
        // bubble sort
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}