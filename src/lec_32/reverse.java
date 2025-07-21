package lec_32;

import java.util.Stack;

public class reverse {
	public static void insertatbtm(Stack<Integer> st,int val) {
		if(st.size()==0) {
			st.push(val);
			return;
		}
		int topelement=st.pop();
		insertatbtm(st,val);
		st.push(topelement);
	}
     public static void reverse(Stack<Integer>st) {
    	 if(st.size()==0) {
    		return;
    	 }
    	 int top=st.pop();
    	 reverse(st);
    	 insertatbtm(st,top);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack <Integer>st=new Stack();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
    		  System.out.println(st);
    		  reverse(st);
    		  System.out.println(st);
	}

}
