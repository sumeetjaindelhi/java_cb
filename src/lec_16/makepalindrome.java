package lec_16;

import java.util.Scanner;

public class makepalindrome {
    public static int getans(String str) {
    	int []  arr=new int [256];
    	 for(int i=0;i<str.length();i++) {
			  char ch =str.charAt(i);
			  int ascii=ch;
			  arr[ascii]++;	  
		  }
		  int count=0;// how many characters are there whose frequency is odd
		  for(int i=0;i<256;i++) {
			  if(arr[i]%2!=0) {
				  count++;
			  }
		  }
		  if(count==0||count==1) {
			  return 0;
		  }else {
			  return count-1;
		  }
	}
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner s=new Scanner(System.in);
              int t=s.nextInt();
              for(int i=1;i<=t;i++) {
            	  int n=s.nextInt();
            	  String str=s.next();
            	  System.out.println(getans(str
            			  ));
              }
	}

}
