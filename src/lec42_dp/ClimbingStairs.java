package lec42_dp;

import java.util.Arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(ways3(n));
		
	}
	
	public static int ways(int n,int dp[])
	{
		if(n==0)
		{
			return 1;
		}
		
		if(n<0)
		{
			return 0;
		}
		
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		
		int ways=ways(n-1,dp);
		int way1=ways(n-2,dp);
		
	   dp[n]= ways+way1;
	   return dp[n];
	}
	
	public static int ways2(int n,int dp[])
	{
		dp[0]=1;
		dp[1]=1;
		
		
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
	public static int ways3(int n)
	{
		int a=1;
		int b=1;
		int res=0;
		
		for(int i=2;i<=n;i++)
		{
			res=a+b;
			a=b;
			b=res;
		}
		
		return res;
	}
	
	
}
