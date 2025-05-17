import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={2,2,3,4,6,10,36,52,84};
        int target=9;

        int low=0;
        int high=arr.length-1;
        int fi=arr.length;

        while(low<=high)
        {
            int mid=(high-low)/2+(low);
            if(arr[mid]==target)
            {
                System.out.println("found at "+(mid+1));
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        System.out.println("first occurance at "+(fi+1));

    }
}