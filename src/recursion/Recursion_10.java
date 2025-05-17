package recursion;

public class Recursion_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println((stairs(n)));
		stairs_dp(n);
	}
	public static int stairs(int n)
	{
		if(n<0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		
		int path1=stairs(n-1);
		int path2=stairs(n-2);
		return path1+path2;
	}
	
	public static void stairs_dp(int n)
	{
		
		int prev2=0;
		int prev=1;
		int curr=0;
		for(int i=1;i<=n;i++)
		{
			curr=prev+prev2;
			prev2=prev;
			prev=curr;
		}
		
		System.out.println("Stairs: "+prev);
	}
}