package lec_35;

import java.util.Arrays;
import java.util.Stack;

public class nextgreater {
public static int [] nge9(int[ ] arr) {
	int [] result=new int [arr.length];
	Arrays.fill(result,-1);
	int n=arr.length;
	
	Stack <Integer> st=new Stack();
	for(int i=n-1;i>=0;i--) {
		while(st.size()>0 && st.peek()<arr[i]) {
			st.pop();
			
		}
		if(st.size()==0) {
			result[i]=-1;
		}else {
			result[i]=st.peek();
		}
		st.push(arr[i]);
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {5,3,6,4,1,2,3,5};
     int [] ans=new int[arr.length];
     for(int i=0;i<ans.length;i++) {
    	 ans[i]=-1;
     }
     int n=arr.length;
     
      for(int i=0;i<n;i++) {
    	  for(int j=i+1;j<n;j++) {
    		  if(arr[j]>arr[i]) {
    			  ans[i]=arr[j];
    			  break;
    		  }
    	  }
      }
      for(int i=0;i<n;i++) {
    	  System.out.print(ans[i]+" ");
      }
     
	}

}
