package lec_9;

import java.util.Scanner;

public class sumofarray {
	public static int sum(int [] arr) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];	
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=s.nextInt();
       }
       int sum=sum(arr);
       System.out.println(sum);
	}

}
