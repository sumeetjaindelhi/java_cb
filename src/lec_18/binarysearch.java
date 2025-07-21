package lec_18;

import java.util.Arrays;

public class binarysearch {
     public static int binarysearch(int [] arr,int target) {
    	     int low=0;
    	     int high=arr.length-1;
    	    
    	    
    	     while(low<=high) {
    	    	 int mid=(low+high)/2;
    	    	 if(arr[mid]==target) {
    	    		 return mid;
    	    	 }else if(arr[mid]<target) {
    	    		 low=mid+1;
    	    	 }else if(arr[mid]>target) {
    	    		 high=mid-1;
    	    	 }
    	     }
    	     return -1;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,10,3,4,5}; 
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
