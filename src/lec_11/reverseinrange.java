package lec_11;

public class reverseinrange {
public static void reverse(int [] arr,int s,int e) {
	int i=s;
	int j=e;
	for(i=s;i<j;i++,j--) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp; 
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int s=2;
		int e=7;
		int n=arr.length;
		reverse(arr,s,e);
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
