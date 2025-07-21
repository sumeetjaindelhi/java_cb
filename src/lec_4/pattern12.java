package lec_4;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row=1;
       int s=5;
	   int p=0;
       while(row<=9) {
    	   int i=1;
    	   while(i<=p) {
    		   System.out.print(" "+" ");
    		   i++;
    	   }
    	   
    	   int j=1;
    	   while(j<=s) {
    		   System.out.print("*"+" ");
    		   j++;
    	   }
    	   
    	   
    	   if(row<5) {
    		   p=p+2;
    		   s=s-1;
    	   }else {
    		   p=p-2;
    		   s=s+1;
    	   }
    	   
    	   
    	   
    	   System.out.println();
    	   row++;
       }
	}

}
