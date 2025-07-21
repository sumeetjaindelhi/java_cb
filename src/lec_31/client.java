package lec_31;

public class client {

	public static void main(String[] args){
		// TODO Auto-generated method stub
        mystack st=new mystack(5);
      try {
    	  st.push(200);
          System.out.println(st.peek());
          st.push(300);
          System.out.println(st.peek());
          st.push(400);
          st.push(2000);
          st.push(4000);
          System.out.println(st.peek());
          st.push(-10);
      }catch(Exception e) {
    	  System.out.println("ho gya resolve");
      }
      System.out.println("hello");
	}

}
