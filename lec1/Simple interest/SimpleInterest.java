package lec1;

import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter Principle, rate and time");
		int p=obj.nextInt();
		int r=obj.nextInt();
		int t=obj.nextInt();
		
		System.out.println("SI is --> RS."+(p*r*t)/100);

	}

}
