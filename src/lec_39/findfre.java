package lec_39;

import java.util.HashMap;

public class findfre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Character,Integer> hm=new HashMap();
           String str="aabacdead";
           for(int i=0;i<str.length();i++) {
        	   if(hm.containsKey(str.charAt(i))) {
        		   hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
        	   }else {
        		   hm.put(str.charAt(i), 1);
        	   }
           }
           for(Character keys:hm.keySet()) {
        	   System.out.println(keys+"->"+hm.get(keys));
           }
           
	}

}
