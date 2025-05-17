package recursion;

public class Recursion_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=3;
	printall(n,"");
	}
	public static void printall(int n,String ans)
	{
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		printall(n-1,ans+'H');
		printall(n-1,ans+'T');
	}
}
