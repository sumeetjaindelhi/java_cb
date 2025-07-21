package lec_10;

public class originalarray {
     public static int [] original(int [] arr) {
    	 int n=arr.length;
    	 int [] a=new int[n];
    	 a[0]=arr[0];
    	 for(int i=1;i<n;i++) {
    		 a[i]=arr[i]-arr[i-1];
    	 }
    	 return a;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,3,6,10,15};
       int [] ans=original(arr);
       int n=ans.length;
       for(int i=0;i<n;i++) {
    	   System.out.print(ans[i]+" ");
       }
	}

}
