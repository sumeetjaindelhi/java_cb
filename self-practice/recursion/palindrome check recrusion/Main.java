import java.util.*;
class Main 
{
    public static boolean checkPalindrome(String s,int i, int n)
    {
        if(i>=n/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-1-i))
        {
            return false;
        }
        return checkPalindrome(s,i+1,n);
    }
    public static void main(String[]args)
    {
        String s="madam";
        System.out.print(checkPalindrome(s,0,s.length()));
    }
}