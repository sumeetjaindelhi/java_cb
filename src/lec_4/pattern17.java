package lec_4;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int row=1;
         int p=2;
 		int a=1;
         while(row<=7) {
        	 
        	if(row==1||row==7) {
        		int s=3;
        		int i=1;
        		while(i<=s) {
        		System.out.print(" "+" ");
        		i++;
        		}
        		System.out.print("*"+" ");
        	}else {
        		
        		
        		int t=1;
        		int i=1;
        		while(i<=p) {
        			System.out.print(" "+" ");
        			i++;
        		}
        		int g=1;
        		while(g<=t) {
        		System.out.print("*"+" ");
        		g++;
        		}
        		int j=1;
        		while(j<=a) {
        			System.out.print(" "+" ");
        			j++;
        		}
        		int k=1;
        		while(k<=t) {
        		System.out.print("*"+" ");
        		k++;
        		}
        		if(row<4) {
        			p=p-1;
        			a=a+2;
        		}else {
        			p=p+1;
        			a=a-2;
        		}
        		
        	}
        	
        	 System.out.println();
        	 row++;
         }
	}

}
