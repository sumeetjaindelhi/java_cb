package lec_23;

public class printallPosiibilities {
    public static void getall(int n,String ans) {
    	
    	if(n==0) {
    		System.out.println(ans);
    		return;
    	}
          getall(n-1,ans+"H");
          getall(n-1,ans+"T");
    	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   getall(3,"");
	}

}
