import java.util.*;

class Main{
    public static void main(String Args[])
        {
            Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<arr.length;i++)
            {
            
                arr[i]=obj.nextInt();
            
            }
            System.out.println("Enter target: ");
            int x=obj.nextInt();

            boolean flag=false;

            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==x)
                {
                    flag=true;
                    break;
                }
            }
            System.out.println("result is : "+flag);

        }
}