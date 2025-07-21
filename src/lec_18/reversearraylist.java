package lec_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reversearraylist {
   public static void reverse(ArrayList<Integer> arr) {
	   int i=0;
	   int j=arr.size()-1;
	   for(i=0;i<j;i++,j--) {
		  int temp=arr.get(i);
		   arr.set(i,arr.get(j));
		arr.set(j,temp);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<Integer> arr=new ArrayList();
           Scanner s= new Scanner (System.in);
           int n=s.nextInt();
           for(int i=0;i<n;i++) {
        	   int val=s.nextInt();
        	   arr.add(val);
           }
           System.out.println(arr);
          // reverse(arr);
           Collections.reverse(arr);
         //  Collections.swap(arr, 1, 2);
           //Collections.sort(arr);
           System.out.println(arr);
	}
	

}
