package lec_17;

public class insertionsortalgo {
	 public static void insertatcorrectposition(int [] arr,int i,int temp) {
	     while(i>=0&&arr[i]>temp) {
	    	 arr[i+1]=arr[i];
	    	 i--; 
	     }
	     arr[i+1]=temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,1,4,2,6,2};
		for(int i=0;i<arr.length-1;i++) {
			insertatcorrectposition(arr,i,arr[i+1]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
