package lec_3;

import java.util.Scanner;


public class abcmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
//		if(a>b && a>c) {
//			System.out.println("a is max");
//		}else {
//        if(b>c) {
//        	System.out.println("b is max");
//        }else {
//        	System.out.println("c is max");  
//        }
//        }
		if(a>b && a>c) {
			System.out.println("aq is max");
		}else if (b>c) {
			System.out.println("b is max");
		}else {
			System.out.println(" c is max");
		}
	}

}
