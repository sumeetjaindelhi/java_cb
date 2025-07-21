package lec_24;

import java.util.ArrayList;

public class printallsubsequencearray {
public static void printall(int [] arr,int i,String ans) {
	if(i==arr.length) {
		System.out.println(ans);
		return;
	}
	
	int k=arr[i]; 
	      printall(arr,i+1,ans+k);
	      printall(arr,i+1,ans+"");
}
public static void getall(int [] arr,int i,ArrayList<Integer> ans) {
	if(i==arr.length) {
		System.out.println(ans);
		return;
	}
	
	int k=arr[i];
	ans.add(k);
	        getall(arr,i+1,ans);
	        ans.remove(ans.size()-1);
	        getall(arr,i+1,ans);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,2,3};
		ArrayList<Integer> ans=new ArrayList();
        getall(arr,0,ans);
	}

}
