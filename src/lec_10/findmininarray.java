package lec_10;

public class findmininarray {
        public static int min(int [] arr) {
        	int n=arr.length;
        	int min=arr[0];
            for(int i=0;i<n;i++) {
          	  if(arr[i]<min) {
          		  min=arr[i];
                   }
            }
          	  return min;
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr= {10,2,-1,3,4,5};
        
          
        	  int min=min(arr);
        	  
          
          System.out.print(min);
	}

}
