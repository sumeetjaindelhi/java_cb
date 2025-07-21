package lec_36;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    node head =new node(10);
    node n2=new node(20);
    node n3=new node(30);
    node n4=new node(40);
    
    
    head.next=n2;
    n2.next=n3;
    n3.next=n4;
    
    node temp=head;
    while(temp!=null) {
    System.out.print(temp.data+" ");
    temp=temp.next; 
    }
	}

}
