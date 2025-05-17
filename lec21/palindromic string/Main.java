import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        int i=0;
        int j=str.length()-1;

        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.print("Non palindromic");
                return;
            }
            i++;
            j--;

        }

        System.out.println("Palindromic");

    }
}