package lec_9;

import java.util.Scanner;

public class demo2 {
	public static void input(int []arr) {
   	 Scanner s=new Scanner(System.in);
   	 int n=arr.length;
   	 for(int i=0;i<n;i++) {
      	 arr[i]=s.nextInt();
        }
    }
	
	  public static void print(int []arr) {
		  int n=arr.length;
	    	 for(int i=0;i<n;i++) {
	       	 System.out.print(arr[i]+" ");
	    	 }
	    	 
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] arr =new int[n];
		input(arr);
		print(arr);
	}

}