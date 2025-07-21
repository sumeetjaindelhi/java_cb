package lec_6;

public class reversetheno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=12345;
       int revno =0;
       while(n>0) {
    	   int lastdigit=n%10;
    	  revno=revno*10+lastdigit;
    	  n=n/10;
       }
       System.out.println(revno);
	}

}
