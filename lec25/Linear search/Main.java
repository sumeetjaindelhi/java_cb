import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,9,8,9,5,6,4,6,10,36,52,84};
        int target=3;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("AT index "+i+1);
                return;
            }
        }

        System.out.println("not found");


    }
}