package lec_15;

public class palindromewith2pointer {
 public static boolean stringpalindromic(String str) {
	 int i=0;
	 int j=str.length()-1;
	 char ch1=str.charAt(i);
	 char ch2=str.charAt(j);
	 while(i<j) {
	 if(ch1!=ch2) {
		 return false;
	 }else {
		 i++;
		 j--;
	 }
	 }
  return true;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          String str1="nitin";
	       System.out.println(stringpalindromic(str1));
	        
	}

}
