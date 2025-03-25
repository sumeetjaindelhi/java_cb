import java.util.*;

class Main{

    public static void selectionSort (int arr[],int s, int e)
    {
        int min=Integer.MAX_VALUE;
        int mini=-1;

        for(int i=s;i<=e;i++)
        {
            if(min>arr[i])
            {
               min=arr[i]; 
               mini=i;
            }
        }

        int temp=arr[mini];
        arr[mini]=arr[s];
        arr[s]=temp;
        
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,-9,5,2};
        for(int i=0;i<arr.length-1;i++)  // -1 for reducing a extra loop for last bacha element.
        {
            selectionSort(arr,i,arr.length-1);
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}