package lec_17;

public class findindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr= {3,4,-1,6,3,-10,5};
          int min =arr[0];
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]<min) {
        		  min=arr[i];
        	  }
          }
	     for(int i=0;i<arr.length;i++) {
	    	 if(arr[i]==min) {
	    		 System.out.println(i);
	    	 }
	     }
	}

}
