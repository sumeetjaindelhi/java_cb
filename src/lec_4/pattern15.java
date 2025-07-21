package lec_4;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int row=1;
            while(row<=5) {
           if(row==1||row==5) {
        	   int i=1;
        	   while(i<=5) {
        		   System.out.print("*"+" ");
        		   i++;
        	   }   
        		   
        	   }else {
        		   int s=1;
        		   int p=3;
        		   int i=1;
        		   while(i<=s) {
        			   System.out.print("*"+" ");
        			   i++;
        		   }
        		   int j=1;
        		   while(j<=p) {
        			   System.out.print(" "+" ");
        			   j++;
        		   }
        		   int g=1;
        		   while(g<=s) {
        			   System.out.print("*"+" ");
        			   g++;
        		   }
        		   
        	   }
        	   
            
            	
            	System.out.println();
            	row++;
            }
	}

}
