package lec_33;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Queue q=new Queue();
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.enqueue(40);
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      q.enqueue(50);
      q.enqueue(60);
      q.display();
	}
	

}
