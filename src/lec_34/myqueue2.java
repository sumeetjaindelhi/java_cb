package lec_34;

import java.util.Stack;
import lec_32.insertatbottom;
public class myqueue2 {
        
	Stack<Integer> st;
	myqueue2(){
		st=new Stack();
	}
	public boolean isempty() {
		return st.isEmpty();
	}
	
	public void enqueue(int val) {
		insertatbottom.insertatbtm(st, val);
	}
	public void dequeue() {
		if(isempty()) {
			System.out.println("queue is empty");
			return;
		}
		st.pop();
	}
	public int front() {
		if(isempty()) {
			System.out.println("queue is empty");
			return -1;
		}
		return st.peek();
	}
	public String toString() {
		        print(st);
        return "";
	}
	public void print(Stack<Integer>st) {
		if(st.isEmpty()) {
			return;
		}
		int ans=st.pop();
		System.out.print(ans+" ");
		print(st);
		
	}
}
