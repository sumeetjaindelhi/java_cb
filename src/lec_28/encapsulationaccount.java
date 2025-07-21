package lec_28;

public class encapsulationaccount {
	int password;
  private int balance;
  
  encapsulationaccount(int password,int balance){
	  this.balance=balance;
	  this.password=password;
  }

public int getBalance(int password) {  
	if(this.password==password) {
		return balance;
	}else {
	return -100;	
	}
	
}

public void setBalance(int balance,int password) {
	if(this.password==password)
	this.balance += balance;
	
}
}