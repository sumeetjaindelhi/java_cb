package lec_39;

import java.util.HashMap;
import java.util.Map;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for each on array
           int [] arr= {1,2,3,4,5,6};
           for(int val:arr) {
        	   System.out.println(val+" ");
           }
           //for each on hash map
           HashMap<String ,Integer> hm=new HashMap();    
           
           //add
           hm.put("mohan", 45);
           hm.put("aman", 34);
           hm.put("sohan", 67);
           System.out.println(hm);
           
           System.out.println(hm.containsKey("mohit"));
           // key-> value
           System.out.println(hm.get("mohan"));
           System.out.println(hm.get("mohit"));
           System.out.println(hm.getOrDefault("mohan", -10));
           System.out.println(hm.getOrDefault("Mohit", -10));
           
           hm.remove("mohan");
           System.out.println(hm.containsKey("mohan"));
           System.out.println(hm);
           
           hm.put("Amit", 40);
           System.out.println(hm);
         
           System.out.println(hm.keySet());
           //to traverse on keys
           for(String keys:hm.keySet()) {
        	   System.out.println(keys+"->"+hm.get(keys));
           }
           //to traverse on values
           for(int val:hm.values()) {
        	   System.out.println(val);
           }
           //on both
           for(Map.Entry<String,Integer> e:hm.entrySet()) {
        	   System.out.println(e.getKey()+"->"+e.getValue());
           }
	}

}
