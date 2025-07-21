package lec_22;

public class stringprint {
      public static void print(String str,int i) {
    	  if(i==str.length()) {
    		  return;
    	  }
    	  System.out.print(str.charAt(i));
    	  print(str,i+1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 String str="abcd";
                 print(str,0);
	}

}
