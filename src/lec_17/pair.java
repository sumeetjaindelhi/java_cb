package lec_17;

public class pair {
         public static boolean pair(int [] arr,int target) {
        	 for(int i=0;i<arr.length;i++) {
        		 for(int j=i+1;j<arr.length;j++) {
        			if( arr[i]+arr[j]==target) {
        				return true;
        			}else {
        				continue;
        			}
        		 }
        	 }
        	 return false;
         }
	public static void main(String[] args) {
	  	// TODO Auto-generated method stub
            int [] arr= {6,3,1,3,5,2};
            int target=9;
            System.out.println(pair(arr,target));
	}

}    
 
 
