package lec_4;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row = 1;
         int s= 9;
         int p= 0;
         while(row<=5) {
       	
       	  
       	  int j =1;
       	  while(j<=p) {
       		  System.out.print(" "+" ");
       		  j++;
       	  }
       	  
       	  int i =1;
       	  while(i<=s) {
       		  if(i%2==0) {
       			  System.out.print(" "+" ");
       		  }else {
       			System.out.print("*"+" ");  
       		  }
       		  i++;
       	  }
       	  
       	  
       	  s=s-2;
       	  p=p+1;
       	  
       	  
       	  
       	  System.out.println();
       	  row++;
         }
	}

}
