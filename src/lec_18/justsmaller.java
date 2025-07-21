package lec_18;

import java.util.Arrays;

public class justsmaller {
	 public static int justsmaller(int [] arr,int target) {
	     int low=0;
	     int high=arr.length-1;
	    int justsmaller=-1;
	    
	     while(low<=high) {
	    	 int mid=(low+high)/2;
	    	
	    	  if(arr[mid]<target) { 
	    		justsmaller=arr[mid];
	    	  low=mid+1;    		 
	    	 }else {
	    		 high=mid-1;
	    	 }
	     }
	     return justsmaller;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {1,3,5,6,7,9}; 
	       Arrays.sort(arr);
	       int target=8;
	       
	      System.out.println(justsmaller(arr,target));
	}

}
