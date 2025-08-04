package lec41_priorityQueue;

import java.util.PriorityQueue;

public class InbuiltPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(1);
		pq.add(20);
		pq.add(10);
		pq.add(-1); // it will do up-heapify
		
		pq.peek();
		
		pq.remove();  // it will do down-heapify as arr[0] and arr[last] will get swap in cbt and now hop violation healing starts
		
		System.out.println(pq);
		
		
		
		

	}

}
