package lec_25;

public class extendedquicksortques {
public static void partition(int [] arr) {
	int pivot=arr[arr.length-1];
	int index =0;
	int n=arr.length;
	for (int i=0;i<n-1;i++) {
		if(arr[i]<pivot) {
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			index++;
		}
	}
	int temp=arr[index];
	arr[index]=arr[n-1];
	arr[n-1]=temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {5,1,3,6,2,2,3,4};
         
         partition(arr);
         for(int val:arr) {
        	 System.out.print(val+" ");
         }
	}

}
