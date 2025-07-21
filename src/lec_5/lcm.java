package lec_5;
import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            int b=s.nextInt();
            for(int i=b;i<=a*b;i+=b) {
            	if(i%a==0) {
            		System.out.println(i);
            		break;
            	}
            }
	}

}
