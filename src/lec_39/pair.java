package lec_39;

import java.util.HashMap;
import java.util.HashSet;

public class pair {
    
	public static void main(String[] args) {
		// TODO Auto-generated method     
         int [] arr= {3,1,4,2,3,5,7};
         int target=7;
         HashMap <Integer,Integer >hm=new HashMap();
         HashSet <Integer> hs=new HashSet();
         for(int i=arr.length-1;i>=0;i--) {
        	 int secondvalue=target-arr[i];
        	 if(hs.contains(secondvalue)) {
        		 System.out.println("mil gaya");
        		 return;
        	 }
        	 hs.add(arr[i]);
         }
         System.out.println("nhi mila");
	}

}
