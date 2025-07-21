package lec_33;

public class Queue {
       private   int [] arr;
          private int front=0;
          private int size=0;
          public Queue() {
        	  this(5);
          }
          public Queue(int n) {
        	  arr=new int [n];
          }
          public boolean isEmpty() {
        	  return size==0;
          }
          public boolean isfull() {
        	  return size==arr.length;
        	  
          }
          public int size() {
        	  return size;
          }
          public void enqueue(int item) throws Exception{
        	  if(isfull()) {
        		  throw new Exception("bklol queue full hai");
        	  }
        	  int idx=(front +size)%arr.length;
        	  arr[idx]=item;
        	  size++;
          }
          public int dequeue()throws Exception {
        	  if(isEmpty()) {
        		  throw new Exception("bklol queue empty hai");
        	  }
        	  int val=arr[front];
        	  size--;
        	  front=(front +1)%arr.length;
        	  return val;
          }
          public int getfront() throws Exception {
        	  if(isEmpty()) {
        		  throw new Exception("bklol queue empty hai");
        	  }
        	  int val=arr[front];
        	  return val;
          }
          public void display() {
        	  for(int i=0;i<size;i++) {
        		  int idx=(front +i)%arr.length;
        		  System.out.print(arr[idx]+" ");
        	  }
          }
}
