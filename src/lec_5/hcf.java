package lec_5;
import java.util.Scanner;
public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner s=new Scanner(System.in);
               int divisor=s.nextInt();
               int dividend=s.nextInt();
               int a= divisor*dividend;
               while(dividend%divisor!=0) {
            	   
            	   int rem =dividend%divisor;
            	   dividend=divisor;
            	   divisor=rem;
               }
               System.out.println(divisor);
               int lcm=a/divisor;
              System.out.println(lcm);
	}

}
