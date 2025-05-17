import java.util.*;

class Main{

  public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int [256];

        String s=obj.next();

        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            int index=((int)a);
            arr[index]+=1;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                char ch=(char)(i);
                System.out.println(ch+ " -> "+ arr[i]);
            }
            
        }

    }
}