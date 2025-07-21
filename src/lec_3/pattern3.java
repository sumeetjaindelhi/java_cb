package lec_3;

public class pattern3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    for(int i =1;i<=5;i++) {
//    	System.out.println();
//    	for(int j=1;j<=i;j++) {
//    		System.out.print("*");
//    	}
//    }
		int row=1;
		while(row<=5) {
			int col=1;
			while(col<=row) {
				System.out.print("*");
				col=col+1;
			}
			System.out.println();
			row++;
		}
	}

}
