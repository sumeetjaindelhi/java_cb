package lec_4;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row = 1;
         int s= 1;
         int p= 4;
         int count;
         while(row<=5) {
       	
       	  
       	  int j =1;
       	  while(j<=p) {
       		  System.out.print(" "+" ");
       		  j++;
       	  }
       	  
       	  int i =1;
       	  count =row;
       	  while(i<=s) {
       		if(i==s||i==1){
     			  System.out.print(count+" ");
     		  }
       		else if(i>1) {
       		  System.out.print("0"+" ");
       		  }
       		  
       		  i++;
       	  }
       	  
       	  
       	  s=s+2;
       	  p=p-1;
       	  
       	  
       	  
       	  System.out.println();
       	  row++;
         }
	}

}
