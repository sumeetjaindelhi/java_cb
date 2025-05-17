import java.util.*;

class Main{

  public static void main(String args[])
    {

        Scanner obj=new Scanner(System.in);
        Stack <Character> st =new Stack();
        String s="{[a+b]+({c+d}+(eo)}";

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='{' || c=='(' ||c=='[')
            {
                st.push(c);
            }
            else if(c=='}' || c==')' ||c==']')
            {
                if(st.size()==0)
                {
                    System.out.println("Not balanced");
                    return;
                }

                else if(st.peek()=='{' && c=='}')
                {
                    st.pop();
                }
                else if(st.peek()=='(' && c==')')
                {
                    st.pop();
                }
                else if(st.peek()=='[' && c==']')
                {
                    st.pop();
                }
            }
        }

        if(st.size()!=0)
        {
            System.out.println("not balanced");
            return;
        }

        System.out.println("balanced");

    }
}