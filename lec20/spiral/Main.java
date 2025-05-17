import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        int rowstart=0;
        int rowend=arr.length-1;
        int colstart=0;
        int colend=arr[0].length-1;

        int total=arr.length*arr[0].length;
       int c=0;
        while(c<total)
        {
            for(int i=colstart;i<=colend;i++)
            {
              System.out.print(arr[rowstart][i]+" ");
              c++;
              }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++)
            {
                System.out.print(arr[i][colend]+" ");
              c++;
            }
            colend--;
            for(int i=colend;i>=colstart;i--)
            {
            System.out.print(arr[rowend][i]+" ");
              c++;
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--)
            {
                System.out.print(arr[i][colstart]+" ");
              c++;
            }
            colstart++;
        }
    }
}