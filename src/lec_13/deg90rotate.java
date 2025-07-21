package lec_13;

import java.util.Scanner;

public class deg90rotate {
	 public static void reverse(int [][] arr) {
		 			int i=0;
		        int j=arr.length-1;
		    
		    	for( i=0;i<=j;i++,j--) { 
		    		int [] temp=arr[i];
		    		arr[i]=arr[j];
		    		arr[j]=temp;
		    	}
			    }
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
        reverse(arr);
        for(int k=0;k<4;k++) {
        	for(int j=0;j<4;j++) {
        	System.out.print(arr[k][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
