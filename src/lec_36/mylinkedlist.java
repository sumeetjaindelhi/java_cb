package lec_36;



public class mylinkedlist {
	
        node head=null;
        
        void insertatbegin(int val) {
        	node n=new node(val);
        	n.next=head;
        	head=n;
        }
        
        void insertatend(int val) {
        	if(head==null) {
        		insertatbegin(val);
        		return; 
        	}
        	node temp=head;
        	while(temp.next!=null) {
        		temp=temp.next;
        	}
        	node n=new node(val);
        	temp.next=n;
        	
        	
        }
        
        void deleteatbegin() throws Exception{
        	if(head==null) {
        		Exception e=new Exception("khaali hai");
        		
        		throw e;
        	}
        	node temp=head;
        	head=head.next;
        	temp.next=null;
        }
        
        void deleteatend() throws Exception{
        	if(head==null) {
        		Exception e=new Exception("khaali hai");
        		throw e;
        	}
        	if(head.next==null) {
        		deleteatbegin();
        	}
        	node temp =head;
        	
        	while(temp.next.next!=null) {
        		temp=temp.next;
        	}
        	temp.next=null;
        }
        
        void insertatindex(int index,int val) {
        	if(head==null) {
        		insertatbegin(val);
        		return;
        	}
        	node temp=head;
        	int i=0;
        	while(i<index-1) {
        		temp=temp.next;
        		i++;
        	}
        	node n=new node(val);
        	n.next=temp.next;
        	temp.next=n;
        }
        
        void deleteatindex(int index)throws Exception {
        	if(head==null) {
        		Exception e=new Exception("khaali hai");
        		throw e;
        	}  
        	node temp=head;
        	node p=head.next;
        	int i=0;
        	while(i<index-1) {
        		temp=temp.next;
        		p=p.next;
        		i++;
        	}
        	temp.next=p.next;
        	p.next=null;
        }
        
        void display() {
        	 node temp=head;
        	    while(temp!=null) {
        	    System.out.print(temp.data+" ");
        	    temp=temp.next; 
        	    }
        }
}
