package lec_10;

public class runningsumof1darray {
public static int[] runningsum(int [] arr) {
	// prefix technique
//	int n=arr.length;
//	int [] a=new int[n];
//	int sum=0;
//	for(int i=0;i<n;i++) {
//		sum=sum+arr[i];
//		a[i]=sum;
	int n=arr.length;
	int [] a=new int[n];
	a[0]=arr[0];
	for(int i=1;i<n;i++) {
		a[i]=arr[i]+a[i-1];
		
	}
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,4};
      int [] ans=runningsum(arr);
      int n=ans.length;
      for(int i=0;i<n;i++) {
    	  System.out.print(ans[i]+" ");
      }
	}

}
