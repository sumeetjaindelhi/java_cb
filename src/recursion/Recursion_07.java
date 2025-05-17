package recursion;

public class Recursion_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="95563";
		String ans=replace(s);
		System.out.println(ans);

	}
	public static String replace(String s)
	{
		if(s.length()==0)
		{
			String ss="";
			return ss;
		}
		char c=s.charAt(0);
		String ss="";
		if(c=='5')
		{
			ss=ss+'0';
		}
		else
		{
			ss+=c;
		}
		ss+=(replace(s.substring(1)));
		return ss;
	}
}
