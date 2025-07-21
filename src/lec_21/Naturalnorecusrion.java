package lec_21;

public class Naturalnorecusrion {
public static int sumofnaturalnumber(int n) {
	         if(n==1) {
	        	 return 1;
	         }  //positive basecase
//	         if(n==0) {
//	        	 return 0;
//	         }  //negative basecase
	
	      int chota= sumofnaturalnumber(n-1);
	      int meraans =chota+n;
	      return meraans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println(sumofnaturalnumber(5));
	}

}
