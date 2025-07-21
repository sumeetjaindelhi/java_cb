package lec_10;

public class runningmax {
public static int [] runninmax(int [] arr) {
//	int n=arr.length;
//	int [] a=new int[n];
//	int max=arr[0];
//	for(int i=0;i<n;i++) {
//		if(arr[i]>max) {
//			max=arr[i]; 
//		}
//		a[i]=max;
//	}
	int n=arr.length;
	int [] a=new int[n];
	a[0]=arr[0];
	for( int i=1;i<n;i++) {
		if(arr[i]>a[i-1]) {
			a[i]=arr[i];
		}else {
			a[i]=a[i-1];
		}
	
	}
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,3,2,1,10,3,5};
       int [] ans=runninmax(arr);
       int n=ans.length;
       for(int i=0;i<n;i++) {
    	   System.out.print(ans[i]+" ");
       }
	}

}
