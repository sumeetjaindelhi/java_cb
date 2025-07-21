package lec_11;

import java.util.Scanner;

public class printandinputin2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        int [][] arr=new int[3][4];
        System.out.println(arr.length);
		System.out.println(arr[0].length);
        for(int k=0;k<3;k++) {
        	for(int j=0;j<4;j++) {
        		arr[k][j]=s.nextInt();
        	}
        }
       	        for(int i=0;i<3;i++) {
        	for(int j=0;j<4;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}
	
	}

