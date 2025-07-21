package lec_10;

public class findmaxinarray {
	 public static int max(int [] arr) {
     	int n=arr.length;
     	int max=arr[0];
         for(int i=0;i<n;i++) {
       	  if(arr[i]>max) {
       		  max=arr[i];
                }
         }
       	  return max;
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,2,-1,3,4,5,-2};
        
        
  	  int max=max(arr);
  	  
    
    System.out.print(max);
	}

}
