package lec_4;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row=1;
         int p=4;
         int s=1;
         int count=1;
         while(row<=5) {
      	   
      	   int i=1;
      	   while(i<=p) {
      		   System.out.print(" "+"\t");
      		   i++;
      	   }
      	   int j=1;
      	   while(j<=s) {
      		   System.out.print(count+"\t");
      		  
      		   count++;
      		   j++;
      	   }
      	   
      	   s=s+2;
      	   p=p-1;
      	   
      	   
      	   System.out.println();
      	   row++;
         }
	}

}
