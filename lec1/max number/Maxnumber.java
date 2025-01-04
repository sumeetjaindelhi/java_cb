package lec1;

import java.util.*;
public class Maxnumber {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		 
		System.out.println("Enter A and B");
		int a=obj.nextInt();
		int b=obj.nextInt();
		if(a>b)
		{
			System.out.println("A is bigger");
		}
		else 
		{
			System.out.println("B is bigger");
		}
	}

}
