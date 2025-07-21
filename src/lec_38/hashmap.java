package lec_38;

public class hashmap {
  public static int hashfnc(String key) {
	  int hashval=Math.abs(key.hashCode());
	  int index=hashval%7;
	  
	  return index;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                                                          0
		String str="Hello";
	}

}
