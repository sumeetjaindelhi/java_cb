package lec1;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter A ");
		int a = obj.nextInt();

		if (a % 2 == 0) {
			System.out.println("A is even");
		} else {
			System.out.println("A is odd");
		}
	}

}
