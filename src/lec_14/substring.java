package lec_14;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="Hello";
         String str2="Hello";
         
         str1=str1+"world";
         System.out.println(str1);
         System.out.println(str2);
         
       //  str1.charAt(1)='E';
        
         System.out.println(str2.substring(2,4));
         str2=str2.substring(0,1)+"E"+str2.substring(2);
         System.out.println(str2);
	}
	
}
