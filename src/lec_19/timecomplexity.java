package lec_19;

import java.util.Scanner;

public class timecomplexity {
public static int sum(int n) {
	int ans =0;
	 for(int i=0;i<=n;i++) {
    	 ans=ans+i;
     }
	 return ans;   
}
public static int summethod2(int n) {
	return n*(n+1)/2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner (System.in);
         long start=System.nanoTime();
         int ans=sum(100);
         System.out.println(ans);
         long end=System.nanoTime();
         System.out.println(end-start);
	}

}
