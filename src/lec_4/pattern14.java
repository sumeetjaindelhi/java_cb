package lec_4;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int p=3;
		int s=1;
		while(row<=7) {
			int i=1;
			while(i<=p) {
				System.out.print(" "+" ");
				i++;
			}
			int j=1;
			while(j<=s) {
				System.out.print("*"+" ");
				j++;
			}
			
			if(row<4) {
				s=s+2;
				p=p-1;
			}else {
				p=p+1;
				s=s-2;
			}
			
			
			
			
			System.out.println();
			row++;
		}
	}

}
