package recursion;

public class Recursion_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][2];
		printAllPaths(arr,0,0,"");
		
	}
	public static void printAllPaths(int arr[][],int sr,int sc,String ans)
	{
		if(sr==arr.length-1 && sc==arr[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		if(sr>arr.length-1 || sc>arr[0].length-1)
		{
			return;
		}
		
		printAllPaths(arr,sr+1,sc,ans+'D');
		printAllPaths(arr,sr,sc+1,ans+'R');
	}

}
