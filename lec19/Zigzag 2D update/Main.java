import java.util.*;

class Main{
    public static void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
            i++;
        }
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=1;i<arr.length;i=i+2)
        {       
            reverse(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();;
        }

    }
}