package lec_13;

import java.util.Scanner;

public class array2dquestions {
    public static void reverse(int []  arr) {
    	//zigzag change in original array
    	int i=0;
        int j=arr.length-1;
    
    	for( i=0;i<j;i++,j--) { 
    		int temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    		
    	
    	}
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
        int i=0;
     
       
        for( i=0;i<3;i++) {
        	if(i%2!=0) {
        		 reverse(arr[i]);      	
         }
          	}
        
        for(int k=0;k<3;k++) {
        	for(int h=0;h<4;h++) {
        		System.out.print(arr[k][h]+" ");
        	}
        	System.out.println();
        }
	}
}
