package lec_6;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int placevalue=1;
		 int ans=0;
		 int n=132;
		 while(n>0) {
			int rem= n%2;
			ans=ans+rem*placevalue;
			n=n/2;
			placevalue=placevalue*10;
		 }
		 System.out.println(ans);
          
	}

}
