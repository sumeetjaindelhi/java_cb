package lec_36;

public class client3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      mylinkedlist list=new mylinkedlist();
     list.insertatbegin(10);
     list.insertatbegin(20);
     list.insertatbegin(30);
     list.display();
     list.insertatbegin(100);
     System.out.println();
      list.insertatend(10);
     list.display();
     list.deleteatbegin();
     System.out.println();
     list.display();
     list.insertatindex(2, 40);
     System.out.println();
     list.display();
     list.deleteatindex(2);
     System.out.println();
     list.display();
	}

}
