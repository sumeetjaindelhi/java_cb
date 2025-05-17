package recursion;

public class Recursion_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,10};
		reverse(arr,0,arr.length-1);
		
		
	}
	public static void reverse(int arr[],int start,int end)
	{
		if(start>end)
		{
			return;
		}
		
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverse(arr, start+1, end-1);
		
	}
}
