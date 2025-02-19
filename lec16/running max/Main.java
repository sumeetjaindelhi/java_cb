import java.util.*;

class Main{

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
        
        

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])   // best of best code likho without any 
            {                     // extra variable as dp approach me reltaion bana nah jaruri hai
                arr[i]=arr[i-1];
            }
            
        }

        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        
        }

    }
}