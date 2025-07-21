package lec_13;

import java.util.Scanner;

public class transpose {
       public static int[][] transpose(int [][] arr) {
    	   int [][] a=new int [4][3];
    	   for(int i=0;i<3;i++) {
    		   for(int j=0;j<4;j++) {
    			   a[j][i]=arr[i][j];
    		   }
    	   }
           
           return a;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        int [][] arr=new int[3][4];
        for(int k=0;k<3;k++) {
        	for(int j=0;j<4;j++) {
        		arr[k][j]=s.nextInt();
        	}
        }
        int [][] h=transpose(arr);
        for(int i=0;i<4;i++) {
 		   for(int j=0;j<3;j++) {
 			   System.out.print(h[i][j]+" "); 
 		   }
 		   System.out.println();
 	   }
        
	}

}
