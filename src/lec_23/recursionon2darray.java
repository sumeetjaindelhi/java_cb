package lec_23;

public class recursionon2darray {
	  static int count =0;
     public static void getpath(int currrow,int currcol,int desrow
    		                        ,int descol,String ans) {
    	 
    	 if(currrow==desrow&&currcol==descol) {
    		 System.out.println(ans);
    		 count++;
    		 return; 
    	 }                                    
    	 if(currrow>desrow||currcol>descol) {
    		 return;
    	 }
    	
    	 getpath(currrow,currcol+1,desrow,descol,"R"+ans);
    	 getpath(currrow+1,currcol,desrow,descol,"D"+ans);
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int m=3;
     getpath(0,0,2,2,"");
     System.out.println(count);
	}        
	    
}
