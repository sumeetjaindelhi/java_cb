package lec_3;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row =1;
        int nst=5;
        while(row<=5) {
        	
        	int i =1;
        	while(i<=nst) {
        		System.out.print("*");
        		i++;
        	}
        	
        	nst=nst-1;
        	System.out.println();
        	row++;
        }
	}

}
