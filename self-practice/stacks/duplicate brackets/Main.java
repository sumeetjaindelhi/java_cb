import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Stack <Character> st=new Stack();
        String s="(a+b)+((b+c*d))";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=')')
            {
                st.push(c);
            }
            else
            {
                if(st.peek()=='(')
                {
                    System.out.println("true");
                    return;
                }
                while(st.peek()!='(')
                {
                    st.pop();
                }
                st.pop();
            }
        }

        System.out.println("false");
        return;
    }
}