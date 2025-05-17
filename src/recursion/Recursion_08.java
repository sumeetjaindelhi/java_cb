package recursion;

public class Recursion_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;
	int dp[]=new int [n+1];
	for(int i=0;i<dp.length;i++)
	{
		dp[i]=-1;
	}
	System.out.println(fibonacci(n,dp));
	
	
	

	}
	public static int fibonacci(int n, int dp[])
	{
		if(n==0 || n==1)
		{
			dp[n]=n;
			return dp[n];
		}
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		dp[n]= fibonacci(n-1,dp)+fibonacci(n-2,dp);
		return dp[n];
	}
}


