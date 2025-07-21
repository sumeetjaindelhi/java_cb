package lec_3;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		while(row<=5) {
			int col=row;
			while(col<=5) {
				System.out.print("*");
				col=col+1;
			}
			System.out.println();
			row++;
		}
	}

}