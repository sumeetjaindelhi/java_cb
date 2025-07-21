package lec_10;

public class reversearray {
     public static void reverse(int [] arr) {
    	 int i=0;

    	 int j=arr.length-1;
    	 for(i=0;i<j;i++,j--) {
    		int temp=arr[i];
    		 arr[i]=arr[j];
    		 arr[j]=temp;
    	 }
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,4,5};
       int n=arr.length;
       reverse(arr);
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();
	}

}
