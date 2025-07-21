package lec_24;

public class ques1 {
	static int count;
public static void subsequence(String str,String ans,int i) {
	if(i==str.length()) {
		System.out.println(ans);
		count++;
		return;
	}
	              
	 subsequence(str,ans+str.charAt(i),i+1);
	 subsequence(str,ans+"",i+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      subsequence("abc","",0);
      System.out.println(count);
	}

}
