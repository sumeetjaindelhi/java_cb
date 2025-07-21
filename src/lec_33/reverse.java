package lec_33;

import java.util.Stack;

public class reverse {
	public static void addlast(Stack <Integer> st,int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int x=st.pop();
		addlast(st,item);
		st.push(x);
		
	}
public static void reverse(Stack<Integer>st) {
	
	if(st.isEmpty()) {
		return;
	}
		
	int ans=st.pop();
	reverse(st);
	addlast(st,ans);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack <Integer> st=new Stack();
	       st.push(10);
	       st.push(20);
	       st.push(30);
	       System.out.println(st);
	      reverse(st);
	       System.out.println(st);
	}

}
