package lec_18;

import java.util.Arrays;

public class minmaxindextarget {
	 public static int binarysearch(int [] arr,int target) {
	     int low=0;
	     int high=arr.length-1;
	    int ans=-1;
	    
	     while(low<=high) {
	    	 int mid=(low+high)/2;
	    	 if(arr[mid]==target) {
	    		 ans =mid;
	    		// high=mid-1;
	    		 low=mid+1;
	    	 }else if(arr[mid]<target) {
	    		 low=mid+1;
	    	 }else if(arr[mid]>target) {
	    		 high=mid-1;
	    	 }
	     }
	     return ans;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {2,3,5,5,5,7,8}; 
	       Arrays.sort(arr);
	       int target=5;
	       
	       int index=binarysearch(arr,target);
	        if(index!=-1) {
	      	 System.out.println("element found at index"+" "+index);
	       }else {
	      	 System.out.println("element not found");
	       }
	}

}
