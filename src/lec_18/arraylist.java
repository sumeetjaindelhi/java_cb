package lec_18;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<Integer>  arr=new ArrayList();
           System.out.println(arr);
           
           //CRUD
           //add the item
           arr.add(12);
           arr.add(10);
           arr.add(4);
           System.out.println(arr);
           arr.add(15);
           //reading the data
           System.out.println(arr.get(1));
           System.out.println(arr.get(2));
           System.out.println(arr.get(3));
           
           System.out.println(arr);
           //update the data;
           arr.set(1,-100);
           System.out.println(arr);
           //delete the data
           arr.remove(1);
           System.out.println(arr);
	}

}
