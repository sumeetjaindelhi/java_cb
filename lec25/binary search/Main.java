import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,9,8,9,5,6,4,6,10,36,52,84};
        int target=3;

        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=(high-low)/2+(low);
            if(arr[mid]==target)
            {
                System.out.println("found at "+(mid+1));
                return;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        System.out.println("not found");

    }
}