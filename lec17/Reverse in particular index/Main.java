import java.util.*;

class Main{

    public static void reverse(int []arr, int s,int e)
    {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9};

        int start=obj.nextInt();
        int end=obj.nextInt();
        reverse(arr,start,end);
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}