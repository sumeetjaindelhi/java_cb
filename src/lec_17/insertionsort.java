package lec_17;

public class insertionsort {
    public static void insertatcorrectposition(int [] arr,int i,int temp) {
    	     while(i>=0&&arr[i]>temp) {
    	    	 arr[i+1]=arr[i];
    	    	 i--; 
    	     }
    	     arr[i+1]=temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          int [] arr= {3,4,6,7,8,2};
          int n= arr.length;
          insertatcorrectposition(arr,n-2,arr[n-1]);
          for(int i=0;i<n ;i++) {
        	  System.out.print(arr[i]+" ");
          }
	}

}
