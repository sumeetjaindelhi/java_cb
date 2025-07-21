package lec_4;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int s=5;
		while (row <= 5) {
			int i = 1;
			int count=5;
			while (i <= 5) {
				if(i==s) {
				System.out.print("*"+" ");
				}else {
					System.out.print(count+" ");
				}
				i++;
				count--;
			}
             s--;
			System.out.println();
			row++;
		}
	}

}
