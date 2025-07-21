package lec_3;
import java.util.Scanner;
public class printhelloworld5Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        for(int i=1;i<=5;i++) {
//        	System.out.println("hello world");
//        }
//		int i=1;
//		while(i<=5) {
//			System.out.println("helloworld");
//		i++;
//		}
		Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		int i=1;
		while(i<=N) {
			System.out.println(" hello world");
			i++;
		}
	}

}
