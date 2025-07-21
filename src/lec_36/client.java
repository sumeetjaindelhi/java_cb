package lec_36;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               node n1=new node(60);
               node n2=new node(70);
               node n3=new node(80);
               
               //creation of links between node
               
               
               n1.next=n2;
               n2.next=n3;
               
               node head =n1;
               node temp=head;
               System.out.println(temp.data);
               temp=temp.next;
               System.out.println(temp.data);
               temp=temp.next;
               System.out.println(temp.data);
               
         
	}

}
