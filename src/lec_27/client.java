package lec_27;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       laptop hp=new laptop(true,"low","i10","windows");
//       hp.ison=true;
//       hp.brightness="high";
//       hp.os="windows";
//       hp.processor="i9 12th gen";
//       
       System.out.println(hp.os);
       System.out.println(hp.brightness);
       
       laptop dell=new laptop(true,"high","i3","windows");
//       dell.ison=true;
//       dell.brightness="high";
//       dell.os="windows";
//       dell.processor="i9 12th gen"; 
       
       System.out.println(dell.os);
       System.out.println(dell.brightness);
	}

}
