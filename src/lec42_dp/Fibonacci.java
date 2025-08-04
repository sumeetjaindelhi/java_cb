package lec42_dp;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(fib1(n,dp));
		
	}
	public static int fib(int n,int dp[])
	{
		if(n==1 || n==0)
		{
			return n;
		}
		
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		
		int a=fib(n-1,dp);
		int b=fib(n-2,dp);
		dp[n]=a+b;
		
		return dp[n];
	}
	
	public static int fib1(int n,int dp[])
	{
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

}
