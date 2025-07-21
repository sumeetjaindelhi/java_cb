package lec_21;

public class recursion {
	// take n and return n factorial
     public static int fact(int n) {
    	 if(n==0) {
    		 return 1;
    	 }
    	 
    	int chotaans= fact(n-1);
    	int meraAns=n*chotaans;
    	return meraAns;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(fact(5));
	}

}
