package lec_34;

public class myqueue {
      
	int frontindex;
	int rearindex;
	int [] arr;
	
	myqueue(int size){
		arr=new int [size];
		frontindex=-1;
		rearindex=-1;		
	}
	
	public boolean isempty() {
//		if(frontindex==-1 && rearindex==-1) {
//			return true;
//		}
//		return false;
		
		return frontindex==-1 && rearindex==-1;
	}
	
	public boolean isfull() {
//		if(rearindex==arr.length-1) {
//			return true;
//		} 
//		return false;
		if((rearindex+1)%arr.length==frontindex) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int val) throws Exception{
		if(isfull()) {
			Exception e=new Exception("kyu daal rhe ho");
			throw e;
		}
		if(rearindex==-1) {
			//frontindex ++;
			frontindex=(frontindex+1)%arr.length;
		}
		//rearindex++;
		rearindex=(rearindex+1)%arr.length;
		arr[rearindex]=val;
	}
	
	public int  dequeue()throws Exception{
		if(isempty()) {
			Exception e=new Exception("kyu nikal rhe ho");
			throw e;
		}
		if(frontindex==rearindex) {
			frontindex=-1;
			rearindex=-1;
		}
		
		int val=arr[frontindex];
		//frontindex++;
		frontindex=(frontindex+1)%arr.length;
		return val;
	}
	public int getfront() {
		if(isempty()) {
			return -1;
		}
		return arr[frontindex];
	}
}
