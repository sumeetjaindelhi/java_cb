package lec_13;

import java.util.Scanner;

public class transposeinsquare {
       public static void transpose(int [][] arr) {
    	   for(int i=0;i<4;i++) {
    		   for(int j=i;j<4;j++) {
    			   int temp=arr[i][j];
    			   arr[i][j]=arr[j][i];
    			   arr[j][i]=temp;
    		   }
    	   }
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        int [][] arr=new int[4][4];
        for(int k=0;k<4;k++) {
        	for(int j=0;j<4;j++) {
        		arr[k][j]=s.nextInt();
        	}
        }
        transpose(arr);
        for(int k=0;k<4;k++) {
        	for(int j=0;j<4;j++) {
        	System.out.print(arr[k][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
