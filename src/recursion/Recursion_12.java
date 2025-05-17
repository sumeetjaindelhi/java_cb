package recursion;

public class Recursion_12 {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		printSubsequence(s,0,"");
		
		System.out.println(count);

	}
	
	public static void printSubsequence(String s,int idx,String ans)
	{
		count++;
		if(idx==s.length())
		{
			System.out.println(ans);
			return ;
		}
		
		printSubsequence(s,idx+1,ans+"-");
		printSubsequence(s,idx+1,ans+s.charAt(idx));
	}

}
