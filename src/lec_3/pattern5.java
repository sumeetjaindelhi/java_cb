package lec_3;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//observe first row
         int row=1;
         int nst =1;
         while(row<=5) {
        	 //work
        	 int i=1;
        	 while(i<=nst) {
        		 System.out.print("*");
        		 i=i+1;
        	 }
        	 
        	 //preparation for next row
        	 nst=nst+1;
        	 System.out.println();
        	 row=row+1;
         }
	}

}
