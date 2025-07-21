package lec_18;

public class linearsearch {
public static int linearsearch(int [] arr,int target) {
	      for(int i=0;i<arr.length;i++) {
	    	  if(arr[i]==target) {
	    		  return i;
	    	  }
	      }
	      return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {5,6,1,3,2,4};
         int target=2;
         int index=linearsearch(arr,target);
         if(index!=-1) {
        	 System.out.println("element found at index"+" "+index);
         }else {
        	 System.out.println("element not found");
         }
	}

}
