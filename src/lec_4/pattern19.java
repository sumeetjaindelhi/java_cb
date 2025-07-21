package lec_4;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int row=1;
         int leftstar=3;
         int rightstar=3;
         int space=1;
         
         while(row<=7) {
        	 if (row==1||row==7) {
        		 int i=1;
        		 while(i<=7) {
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
              	   
              	   if(row<4) {
              		   leftstar=leftstar-1;
              		   rightstar=rightstar-1;
              		   space=space+2;
              	   }else {
              		   leftstar=leftstar+1;
              		   rightstar=rightstar+1;
              		   space=space-2;
              	   }
                 }
        	 
        	 
        	 
        	 System.out.println();
        	 row++;
         }
	}
}
