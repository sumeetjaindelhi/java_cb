package lec_24;

import java.util.ArrayList;

public class target {
	public static void getall(int [] arr,int i,ArrayList<Integer> ans,
			int targetsum,int currsum) {
		if(currsum>targetsum) {
			return; 
		}
		
		if(i==arr.length) {
				System.out.println(ans);
			return;
		}
		int k=arr[i];
		ans.add(k);
		        getall(arr,i+1,ans,targetsum,currsum+arr[i]);
		        ans.remove(ans.size()-1);
		        getall(arr,i+1,ans,targetsum,currsum+0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,4,3,2,1};
		ArrayList<Integer> ans=new ArrayList();
		getall( arr, 0,ans,6,0);
	}

}
