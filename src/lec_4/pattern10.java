package lec_4;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//mirror pattern
		int row =1;
		int nst=1;
		while(row<=9) {
			int i=1;
			while(i<=nst) {
				System.out.print("*"+" ");
				i++;
			}
			
			if(row<5) {
				nst=nst+1;
			}else {
				nst=nst-1;
			}
			
			
			
			
			
			System.out.println();
			row=row+1;
		}
	}

}
