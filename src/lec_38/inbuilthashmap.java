package lec_38;

import java.util.HashMap;

public class inbuilthashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
      
   
	}

}
