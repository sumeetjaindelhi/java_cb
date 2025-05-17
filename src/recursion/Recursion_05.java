package recursion;

public class Recursion_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		print(s,0);

	}
	public static void print(String s,int idx)
	{
		if(idx==s.length())
		{
			return;
		}
		System.out.print(s.charAt(idx));
		print(s,idx+1);
		return;
	}

}
