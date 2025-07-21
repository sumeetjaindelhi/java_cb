package lec_4;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row = 1;
         int s= 5;
         int p= 0;
         while(row<=5) {
       	
       	  
       	  int j =1;
       	  while(j<=p) {
       		  System.out.print(" "+" ");
       		  j++;
       	  }
       	  
       	  int i =1;
       	  while(i<=s) {
       		  System.out.print("*"+" ");
       		  i++;
       	  }
       	  
       	  
       	  s=s-1;
       	  p=p+2;
       	  
       	  
       	  
       	  System.out.println();
       	  row++;
         }
	}

}
