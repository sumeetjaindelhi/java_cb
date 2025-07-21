package lec_4;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int row =1;
          int d=4;
          int s=1;
          while(row<=5) {
        	  
        	  int i=1;
        	  while(i<=d) {
        		  System.out.print("$");
        		  i++;
        	  }
        	  int j=1;
        	  while(j<=s) {
        		  System.out.print("*");
        		  j++;
        	  }
        	  d=d-1;
        	  s=s+1;
        	  System.out.println();
        	  row++;
          }
	}

}
