import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        String s=obj.next();
       
       for(int i=0;i<s.length();i++)
       {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
       }

    }
}