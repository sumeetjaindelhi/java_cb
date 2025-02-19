import java.util.*;

class Main{
    public static void main(String Args[])
        {

            Scanner obj=new Scanner(System.in);
            int arr[]={1,284,585,42,41,-2,47,36};
            int i=0;
            int j=arr.length-1;

            while(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            for(int a=0;a<arr.length;a++)
            {
                System.out.print(arr[a]+" ");
            }

        }
}