package lec_15;



public class palindrome {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		
		 String str1="nitin";
	        String str2="";
	        int i=0;
	        int j=str1.length()-1;
	        for(j=str1.length()-1;j>=i;j--) {
	            str2=str2+str1.charAt(j);  	
	        }
	        if(str1.equals(str2)) {
	        	System.out.println("string is palindrome");
	        }else {
	        	System.out.println("string is not palindrome");
	        }
	        
	        
	      
	}

}
