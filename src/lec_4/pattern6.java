package lec_4;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row=1;
		 int s=9;
		 int p=0;
		 while(row<=5) {
			 int i =1;
			 while(i<=p) {
				 System.out.print(" "+" ");
				 i++;
			 }
			 
			 int j=1;
			 while(j<=s) {
				 System.out.print("*"+" ");
				 j++;
			 }
			 s=s-2;
			 p=p+1;
			 
			 
			 System.out.println();
			 row++;
		 }
	}

}
