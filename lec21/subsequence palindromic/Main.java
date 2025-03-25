import java.util.*;

class Main{
    public static boolean isPossible(String s)
    {
        int arr[]=new int [256];
        for(int i=0;i<256;i++)
        {
            arr[s.charAt(i)]++;
        }
        int count=0;
        for(int i=0;i<256;i++)
        {
            if(arr[i]%2!=0)
            {
               count++;
            }
        }
        if(count>1)
        {
            return false;
        }
        return true;
    }

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        String s=obj.nextInt();
        System.out.println( isPossible(s));


    }
}