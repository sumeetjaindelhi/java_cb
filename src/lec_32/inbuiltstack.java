package lec_32;


import java.util.Stack;

public class inbuiltstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Stack<Integer> st=new Stack();
          
          st.push(12);
          st.push(13);
          
          System.out.println(st.peek());
          
          System.out.println(st.size());
          
          int ans =st.pop();
          System.out.println(ans);
          
          System.out.println(st.peek());
          
          System.out.println(st.isEmpty());
	}

}
