package lec_12;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {1,2,3,4,5};
         int n =arr.length;
                 for(int i=0;i<n;i++) {
                        	 
            	for(int j=i;j<n;j++) {
           		 int sum=0;

            	 for(int k=i;k<=j;k++) {
                        sum=sum+arr[k];
            		
                 	System.out.print(arr[k]+" ");
                 	
                 }
            	System.out.print(sum);
            	 System.out.println();
            	}
            	
            }
	}

}
