import java.util.*;

class Main{

    public static void suffixsub(int [] arr)
    {
      for(int i=arr.length-1;i>0;i--)
      {
        arr[i]=arr[i]-arr[i-1];
      }
      
      for(int i=0;i<arr.length;i++)
      {
      System.out.print(arr[i]+" ");
      
      }
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=obj.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
          {
            arr[i]=obj.nextInt();
          }
        
        suffixsub(arr);

    }
}