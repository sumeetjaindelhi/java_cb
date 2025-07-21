package lec_22;

public class replace5with0 {
 public static String replace(String str) {
	 if(str.length()==0) {
		 return "";
	 }
	    String chhotaans=replace(str.substring(1));
	      String meraans="";
	      if(str.charAt(0)=='5') {
	    	  meraans='0'+chhotaans;
	      }else {
	    	  meraans=str.charAt(0)+chhotaans;
	      }
	      return meraans;
	  
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="93503578";         
     System.out.println(replace(str));
	}

}
