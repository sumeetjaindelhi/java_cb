package lec_21;

public class printnaturalno {
    public static void decprint(int n) {
    	if(n==0) {
    	
    		return ;
    	}
    	
    	  System.out.println(n);
    	  decprint(n-1);
    	  
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          decprint(5);
	}

}
