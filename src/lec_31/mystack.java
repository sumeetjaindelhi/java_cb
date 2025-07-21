package lec_31;

public class mystack {
    //state
   	protected int topindex;           
	protected int [] arr;
	public mystack(int size){
		 arr=new int [size];
		 topindex=-1;
	 }
	
	//behaviour
	 public boolean isempty() {
		 if(topindex==-1) {                                                                                                                                      
			 return true;
		 } 
		 return false;   
	 }
	 
	 public void push(int val) throws Exception { 
		 if(topindex==arr.length-1) {
			// System.out.println("kyu daal rhe ho");
			Exception e= new Exception("kyu daal rhe ho");
			throw e;   
			
		 }
		 arr[++topindex]=val;
	 }
	 
	 
	 public void pop() {
		 if(isempty()==true) {
			 System.out.println("kyu nikal rha hai");
			 return;
		 }
		 topindex--;
	 }
	 public int peek() {
		 if(isempty()==true) {
			 System.out.println("kyu dekh rha hai");
			 return -1;
		 }
		 return arr[topindex];
	 }
}
