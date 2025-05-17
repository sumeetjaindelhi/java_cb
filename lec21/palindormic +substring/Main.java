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
                String str=(s.substring(i,j));
                int k=0;
                int m=str.length()-1;

                while(k<m)
                {
                    if(str.charAt(k)!=str.charAt(m))
                    {
                       break;
                    }
                    k++;
                    m--;

                }
                if(k>=m)
                {
                    System.out.println(str+" "+"is Palindromic");
                }
            }
            
       }

        

    }
}