package lec_11;

public class rotate {
	public static void reverse(int [] arr,int s,int e) {
		int i=s;
		int j=e;
		for(i=s;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp; 
		}
	}
  public static void rotate(int[] arr,int k) {
	  int n=arr.length;
	  k=k%n;
	  reverse(arr,0,n-1);
      reverse(arr,0,k-1);
      reverse(arr,k,n-1);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr= {1,2,3,4,5,6,7};
          int k=1;
          int n=arr.length;
         rotate(arr,k);
          for(int i=0;i<n;i++) {
        	  System.out.print(arr[i]+" ");
          }
	}

}
