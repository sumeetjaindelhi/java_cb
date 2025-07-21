package lec_23;

public class printallpaths {
	static int count =0;
     public static void printall( int n,String str) {
    	 
    	 if(n==0) {
    		 System.out.println(str);
    		 count++;
    		 return;
    	 }
    	 if(n<0) {
    		 return;
    	 }
    	 
    	 
    	 printall(n-1,"1"+str);
    	 printall(n-2,"2"+str);
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    printall(3,"");
    System.out.println(count);
	}

}
