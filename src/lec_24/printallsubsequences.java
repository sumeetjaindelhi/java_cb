package lec_24;

public class printallsubsequences {
   public static void printall( String str,String ans) {
	   
	   if(str.length()==0) {
		   System.out.println(ans);
		   return;
	   }
	   
	   char ch=str.charAt(0);
	     printall(str.substring(1),ans+ch);
	     printall(str.substring(1),ans);
   }                                           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     printall("abc","");
	}

}
