package lec_10;

import java.util.Scanner;

public class checkgiventarget {
public static boolean checktarget(int [] arr,int target) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		if(arr[i]==target) {
			return true;
	         }
	       }
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int [] arr=new int [n];
	  for(int i=0;i<n;i++) {
		  arr[i]=s.nextInt();
	  }
	  int target=s.nextInt();
	  boolean result=checktarget(arr,target);
	  System.out.println(result);
	} 
	

}
