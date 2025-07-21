package lec_33;

public class Stack {
         private int arr[];
         private int idx=-1;
         public Stack() {
        	 this(5);
        	 arr=new int [5];
         }
         public Stack(int n) {
        	 arr=new int [n];
         }
         public boolean isEmpty() {
        	 return idx==-1;
         }
         public void push(int item) throws Exception {
        	if( isfull()) {
        		throw new Exception("bklol stack full hai");
        	}
        	 arr[++idx]=item;
         }
         public int size() {
        	 return idx+1;
         }
         public boolean isfull() {
        	 return size()==arr.length;
         }
         public int peek() throws Exception{
        	 if(isEmpty()) {
        		 throw new Exception("bklol stack empty hai");
        	 }
        	 return arr[idx];
        	 
         }
         public int pop() throws Exception{
        	 if(isEmpty()) {
        		 throw new Exception("bklol stack empty hai");
        	 }
        	 int val=arr[idx];
        	 idx--;
        	 return val;
         }
         public void display() {
        	 for(int i=0;i<=idx;i++) {
        		 System.out.print(arr[i]+" ");
        	 }
        	 System.out.println();
         }
}
