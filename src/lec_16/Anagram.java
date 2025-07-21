package lec_16;

import java.util.Scanner;

public class Anagram {
public static boolean anagram(String str1,String str2) {
	int [] arr=new int [256];
	 for(int i=0;i<str1.length();i++) {
		  char ch =str1.charAt(i);
		  int ascii=ch;
		  arr[ascii]++;	  
	  }
	int [] a=new int [256];
	 for(int i=0;i<str2.length();i++) {
		  char ch =str2.charAt(i);
		  int ascii=ch;
		  a[ascii]++;	  
	  }
	 for(int i=0;i<256;i++) {
		  if(arr[i]==a[i]) {
			continue;
		 }else {
			 return false;
		 }
	 }
	 return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       String str1=s.next();
       String str2=s.next();
       System.out.println(anagram(str1,str2));
	}

}
