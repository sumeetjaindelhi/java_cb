package recursion;

public class Recursion_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,10};
		print(arr,0);
		
		
	}
	public static void print(int arr[],int idx)
	{
		if(idx==arr.length)
		{
			return;
		}
		System.out.println(arr[idx]);
		print(arr,idx+1);
		
		
		
	}
}
