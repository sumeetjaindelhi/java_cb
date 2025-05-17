package recursion;
import java.util.*;
public class Recursion_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3};
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> a=new ArrayList<>();
		printSubsequence(arr,0,sb);
		printSubsequence2(arr,0,a);
	}
	
	public static void printSubsequence(int arr[],int idx,StringBuilder ans)
	{
	
		if(idx==arr.length)
		{
			System.out.println(ans);
			return ;
		}
		
		printSubsequence(arr,idx+1,ans.append("-"));
		ans.setLength(ans.length()-1);
		printSubsequence(arr,idx+1,ans.append(arr[idx]));
		ans.setLength(ans.length()-1);
	}
	
	public static void printSubsequence2(int arr[],int idx,ArrayList<Integer> ans)
	{
	
		if(idx==arr.length)
		{
			System.out.println(ans);
			return ;
		}
		
		printSubsequence2(arr,idx+1,ans);
		ans.add(arr[idx]);
		printSubsequence2(arr,idx+1,ans);
		ans.remove(ans.size()-1);
	}

}
