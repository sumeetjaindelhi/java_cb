import java.util.*;

class Main{

    public static void minValueIndex (int arr[],int s, int e)
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
        System.out.println(mini);
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[]={1,2,3,4,-15,6,7,8,9,-10};
        int s=0;
        int e=2;
        minValueIndex(arr,s,e);
        

    }
}