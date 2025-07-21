package lec_32;

import java.util.Stack;

public class balancedparenthesis {
  public static boolean isbalanced(String str) {
	  Stack <Character> st=new Stack();
	  for(int i=0;i<str.length();i++) {
		  char ch=str.charAt(i);
		  if(ch=='(') {
			  st.push(ch);
		  }else {
			  if(st.isEmpty()) {
				  return false;
			  }else {      
				  st.pop(); 
			  }
		  }
	  }
	  return st.isEmpty();      
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="((()))";          
      System.out.println(isbalanced(str)); 
    		   
	}

}
