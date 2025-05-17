package recursion;

public class Recrusion_01 {

	public static void main(String[] args) {
		
		sum(5);
		System.out.println();
	}
	public static void sum(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		sum(n-1);
	}

}
