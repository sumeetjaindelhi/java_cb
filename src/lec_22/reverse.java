package lec_22;

public class reverse {
     public static void reverse(int [] arr,int i,int j) {
    	 if(i>j) {
    		return;
    	 }
    	       int temp=arr[i];
    	       arr[i]=arr[j];
    	       arr[j]=temp;
    	      reverse(arr,i+1,j-1);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr= {1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        for(int k=0;k<arr.length;k++) {
        	System.out.print(arr[k]+" ");
        }
	}

}
