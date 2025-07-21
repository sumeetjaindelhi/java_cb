package lec_26;

public class Ac {
//state ->variables
	boolean ison;
	int temp;
	int fanspeed;
	
	//behaviours ->function
	
	
	void geton() {
		ison=true;
	}
	void getoff() {
		ison=false;
	}
	void inctemp() {
		if(temp<30) {
			temp++;
		}
		
	}
	void dectemp() {
		if(temp>16) {
			temp--;
		}
		
	}

}
