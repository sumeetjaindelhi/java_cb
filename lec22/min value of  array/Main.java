import java.util.*;

class Main{

    public static void minValueIndex (int arr[])
    {
        int min=arr[0];
        int mini=0;

        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                mini=i;
            }
        }
        System.out.println(mini);
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,4,-15,6,7,8,9,-10};
        minValueIndex(arr);
        

    }
}