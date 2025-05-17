package recursion;

public class Recursion_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="95563";
		StringBuilder ans=replace(s);
		System.out.println(ans);

	}
	public static StringBuilder replace(String s)
	{
		if(s.length()==0)
		{
			StringBuilder ss=new StringBuilder("");
			return ss;
		}
		char c=s.charAt(0);
		StringBuilder ss=new StringBuilder("");
		if(c=='5')
		{
			ss.append('0');
		}
		else
		{
			ss.append(c);
		}
		ss.append(replace(s.substring(1)));
		return ss;
	}
}
