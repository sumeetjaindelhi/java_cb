package lec_33;
import java .util.Stack;

public class leetcode2375 {
    public static String sn(String s) {
    	Stack<Integer>st=new Stack();
    	int [] arr=new int [s.length()+1];
    	int count=1;
    	for(int i=0;i<=s.length();i++) {
    		if(i==s.length()|| s.charAt(i)=='I') {
    			arr[i]=count++;
    			while(!st.isEmpty()) {
    				arr[st.pop()]=count++;
    			}
    		}else {
    			st.push(i);
    		}
    	}
    	String ans="";
    	for(int i=0;i<arr.length;i++) {
    		ans=ans+arr[i];
    	}
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="IIIDIDDD";
	}

}
