package lec41_priorityQueue;

import java.util.PriorityQueue;

public class Heapsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= { 1,5,6,3,25,15,96,1,-2,30,-256,45};
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i:arr)
		{
			pq.add(i);
		}
		int i=0;
		while(pq.size()>0)
		{
			arr[i]=pq.remove();
			i++;
		}
		for(int i1 :arr)
		{
			System.out.print(i1+" ");
		}
		

	}

}
