package lec_19;

import java.util.Scanner;

public class maxvaluex {
public static int getx(int n) {
	int low=0;
	int high=n;
	int ans =0;
	while(low<=high) {
		int mid=(low+high)/2;
		if(mid*mid<=n) {
			ans =mid;
			low=mid+1;
		}else {
			high=mid-1;
		}
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(getx(n ));
      
	}

}
