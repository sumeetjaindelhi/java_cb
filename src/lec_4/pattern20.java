package lec_4;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int row=1;
          int leftstar=1;
          int rightstar=1;
          int space=7;
          while(row<=5) {
         if(row==5) {
        	 int i=1;
        	 while(i<=9) {
        		 System.out.print("*"+" ");
        		 i++;
        	 }
         }else {
        	  int i=1;
        	  while(i<=leftstar) {
        		  System.out.print("*"+" ");
        		  i++;
        	  }
        	  int j=1;
        	  while(j<=space) {
        		  System.out.print(" "+" ");
        		  j++;
        	  }
        	  int k=1;
        	  while(k<=rightstar) {
        		  System.out.print("*"+" ");
        		  k++;
        	  }
        	  
        	  leftstar=leftstar+1;
        	  rightstar=rightstar+1;
        	  space=space-2;
         }
        	  
        	  System.out.println();
        	  row++;
          }
	}

}
