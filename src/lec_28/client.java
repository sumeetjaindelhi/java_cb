package lec_28;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        encapsulationaccount lakshay=new encapsulationaccount(1234,100);
        System.out.println(lakshay.getBalance(1234));
        lakshay.setBalance(100,1234);
        System.out.println(lakshay.getBalance(1234));
	}

}
