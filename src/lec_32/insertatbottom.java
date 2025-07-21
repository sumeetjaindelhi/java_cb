package lec_32;

import java.util.Stack;

public class insertatbottom {
	public static void insertatbtm(Stack<Integer> st,int val) {
		if(st.size()==0) {
			st.push(val);
			return;
		}
		int topelement=st.pop();
		insertatbtm(st,val);
		st.push(topelement);
	}
public static void insertatbottom(Stack<Integer>st, int val) {
	Stack<Integer> s =new Stack();
	
	while(st.size()>0) {
		int ans=st.pop();
		s.push(ans);
		
	}
	st.push(val);
	
	while(s.size()>0) {
		int ans=s.pop();
		st.push(ans);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st =new Stack();
		st.push(1);
		st.push(2);
		
		insertatbtm(st,3);
	
	System.out.println(st);
		
		
	}

}
