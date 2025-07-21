package lec_6;

public class replace0by9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6303070;
		int placevalue = 1;
		int sum = 0;

		while (n > 0) {
			int lastdigit = n % 10;
			if (lastdigit == 0) {
				lastdigit = 9;
			}

			sum = sum + placevalue * lastdigit;
			n = n / 10;
			placevalue = placevalue * 10;

		}
		System.out.println(sum);
	}

}
