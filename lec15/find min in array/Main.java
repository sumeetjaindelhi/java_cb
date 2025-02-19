import java.util.*;

class Main{

    public static int getMin(int arr[])
    {
        int min=Integer.MAX_VALUE;  // iski jarurat nahi hai as arr[0] se bhi initalize karke use kar sakte the as voh aur next comapre kar lenge 

        for(int i=0;i<arr.length;i++)
        {
        
          if(min>arr[i])
          {
            min=arr[i];
          }
        
        }
        return min;
    }
    public static void main(String Args[])
    {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<arr.length;i++)
        {
        
            arr[i]=obj.nextInt();
        
        }
        System.out.println(getMin(arr));

    }
}