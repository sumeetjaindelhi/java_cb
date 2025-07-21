package lec_25;

public class quicksortques {
public static void partition(int [] arr ,int pivot) {
	int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<pivot) {
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
			index++;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {5,1,3,6,2,2,3};
         int pivot=4;
         partition(arr,pivot);
         for(int val:arr) {
        	 System.out.print(val+" ");
         }
        	 
}

}
