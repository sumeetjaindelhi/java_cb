package lec_11;

import java.util.Scanner;

public class zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        int [][] arr=new int[3][4];
        for(int k=0;k<3;k++) {
        	for(int j=0;j<4;j++) {
        		arr[k][j]=s.nextInt();
        	}
        }
        int i=0;
        int j=0;
       
        for( i=0;i<3;i++) {
        	if(i%2==0) {
         for( j=0;j<4;j++) {
          System.out.print(arr[i][j]+" ");
        	} 	
        	}else {
        		for(j=3;j>=0;j--) {
        			System.out.print(arr[i][j]+" ");
        		}
        	}
         }
        
        
        
        
        
        }  
	}
        
	
	
	
