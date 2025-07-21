package lec_4;

public class pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row=1;
        int a=0;
    	int p=3;
        while(row<=5) {
        	
        	int i=1;
        	while(i<=a) {
        		System.out.print(" "+" ");
        		i++;
        	}
        	System.out.print("*"+" ");
        	
        	int j=1;
        	while(j<=p) {
        		System.out.print(" "+" ");
        		j++;
        	}
        	if(row!=3) {
        		System.out.print("*"+" ");
        	}
        	
        	if(row<3) {
        		a=a+1;
        		p=p-2;
        	}else {
        		a=a-1;
        		p=p+2;
        	}
        	
        	
        	
        	System.out.println();
        	row++;
        }
	}

}
