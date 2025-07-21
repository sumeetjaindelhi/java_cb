package lec_5;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int count=0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
				
				if(count>2) {
					break;
				}
			} 
		}
				if (count == 2) {
					System.out.println("Prime");
				} else {
                     System.out.println("Not Prime");
				}
			
		}
	}


