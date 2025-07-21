package dynamicstack;

import lec_31.mystack;

public class dynostack extends mystack{
      dynostack(int size){
    	  super(size);
      }
      @Override //Annotation-agar galat jaunga to bta dega
      public void push(int val) throws Exception{
    	  if(super.topindex==arr.length-1) {
    		  int [] newarr=new int[2*arr.length];
    		  for(int i=0;i<arr.length;i++) {
    			  newarr[i]=arr[i];
    		  }
    		  super.arr=newarr;
    	  }
    	  super.push(val);
//    	  topindex++;
//    	  arr[topindex]=val;
      }
}
