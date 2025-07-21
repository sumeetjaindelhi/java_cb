package lec_3;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for( int i=1;i<=5;i++) {
//	System.out.println();
//	for( int j=1;j<=6;j++) {
//		System.out.print("*");
//	}
//}
		int row = 1;
		while (row <= 5) {
			int i = 1;
			while (i <= 6) {
				System.out.print("*");
				i++;
			}

			System.out.println();
			row++;
		}
	}

}
