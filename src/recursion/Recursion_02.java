package recursion;

public class Recursion_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,10};
		int sum=sum(arr,0);
		System.out.print(sum);
		
	}
	public static int sum(int arr[],int idx)
	{
		if(idx==arr.length)
		{
			return 0;
		}
		return arr[idx]+sum(arr,idx+1);
	}
}