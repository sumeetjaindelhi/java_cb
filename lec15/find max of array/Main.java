import java.util.*;

class Main{

    public static int getMin(int arr[])
    {
        int max=Integer.MIN_VALUE;  // iski jarurat nahi hai as arr[0] se bhi initalize karke use kar sakte the as voh aur next comapre kar lenge 

        for(int i=0;i<arr.length;i++)
        {
        
          if(max<arr[i])
          {
            max=arr[i];
          }
        
        }
        return max;
    }
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
     
        int arr[]={1,2,3,48,25,96,1058,82681,8451,4856,4,9846};
        System.out.println(getMin(arr));

    }
}