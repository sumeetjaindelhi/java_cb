package lec_6;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=1000010;
       int placevalue=1;
       int ans=0;
       
       while(n>0) {
    	   int rem=n%10;
    	   ans=ans+rem*placevalue;
    	   
    	   n=n/10;
    	   placevalue=placevalue*2;
    	   
    	  
       }
       System.out.println(ans);
	}
}
