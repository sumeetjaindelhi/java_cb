package lec_5;
import java.util.Scanner;
public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s= new Scanner(System.in);
          
          int n=s.nextInt();
          int r=s.nextInt();
          int nfact=1;
          int rfact=1;
          int nminusrfact=1;
          for(int i=1;i<=n;i++) {
        	  nfact=nfact*i;
          }
          for(int j=1;j<=r;j++) {
        	  rfact=rfact*j;
          }
          for(int k=1;k<=(n-r);k++) {
        	  nminusrfact=nminusrfact*k;
          }
          int ncr=nfact/(nminusrfact*rfact);
        		  System.out.println(ncr);
	}

}
