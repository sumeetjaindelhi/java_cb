package oops;

public class Ac {
	
	// State --> variables
	
	boolean isOn;
	int temp;
	int fanSpeed;
	
	
	//Behavior --> functions
	
	void getOn()
	{
		isOn=true;
	}
	
	void getOff()
	{
		isOn=false;
	}
	
	void increaseTemp()
	{
		if(temp<30)
		{
			temp++;
		}
	}
	
	void decreaseTemp()
	{
		if(temp>16)
		{
			temp--;
		}
	}
	
	 

}
