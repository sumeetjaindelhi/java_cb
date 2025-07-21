package lec_25;

public class mergesort {
	public static int [] mergetwoarray(int[] arr1,int [] arr2) {
		 int i=0;
		 int j=0;
		 int n1=arr1.length;
		 int n2=arr2.length;
		 int [] result=new int[n1+n2];  
		 int index=0;
		 while(i<n1 && j<n2) {
			 if(arr1[i]<arr2[j]) {
				 result[index]=arr1[i];
				 i++;
				 index++;
			 }else {
				 result[index]=arr2[j];
				 j++;
				 index++;
			 }
		 }
		 
		 while(i<n1) {
			 result[index]=arr1[i];
			 index++;
			 i++;
		 }
		 while(j<n2) {
			 result[index]=arr2[j];
			 index++;
			 j++;
		 }
		 return result;
				 
	 }
	public static int [] mergesort(int [] arr,int s,int e) {
		 
		 if(s==e) {
			 int [] basecasearray=new int [1];
			 basecasearray[0]=arr[s];
			 return basecasearray;
		 }
		 
		 int mid=(s+e)/2;
		 int [] left=mergesort(arr,s,mid);
		 int [] right=mergesort(arr,mid+1,e);
		 int [] result=mergetwoarray(left,right);
		 return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,1,4,2,1,5,3};
		int [] result= mergesort(arr,0,arr.length-1); 
		for(int val:result) {
			System.out.print(val+" ");
		}
	}

}
