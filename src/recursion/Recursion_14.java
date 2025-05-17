package recursion;

import java.util.ArrayList;

public class Recursion_14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3,4,6};
		
		ArrayList<Integer> a=new ArrayList<>();
		printSubsequence2(arr,0,a,6);
		
	}

	public static void printSubsequence2(int arr[],int idx,ArrayList<Integer> ans,int target)
	{
		if(target==0)
		{
			System.out.println(ans);
			return;
		}
		if(target<0)
		{
			return;
		}
		if(idx==arr.length)
		{
			return ;
		}
		
		ans.add(arr[idx]);
		printSubsequence2(arr,idx+1,ans,target-arr[idx]);
		ans.remove(ans.size()-1);
		printSubsequence2(arr,idx+1,ans,target);
		
	}


}