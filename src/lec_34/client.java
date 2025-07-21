package lec_34;

public class client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//         myqueue q=new myqueue(5);
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.enqueue(40);
//         q.enqueue(50);
//      
//         q.dequeue();
//         q.dequeue();
//         System.out.println(q.getfront());
		
		myqueue2 q=new myqueue2();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.front());
		q.dequeue();
		System.out.println(q.front());	
		System.out.println(q);
	}

}
