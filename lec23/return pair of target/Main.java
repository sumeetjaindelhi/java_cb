import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
         int arr[]={1,2,3,-9,5,2,4};

         Arrays.sort(arr);

        int target=7;

        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==target)
            {
                System.out.print(arr[i]+" "+arr[j]+" ");
                return;
                
            }
            else if(arr[i]+arr[j]>target)
            {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("no pair");
    }
}