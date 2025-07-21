package lec_17;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int a=13;
//    Integer a1=13;
 //   System.out.println(Integer.toBinaryString(13));
//     
//     System.out.println(Integer.MIN_VALUE); 
//     
//     String str=Integer.toString(145);   
//     System.out.println(str);
//     
//     int b=Integer.parseInt(str);
//     System.out.println(b);
//		
		Integer a=13;
		//int b=a; 
		int b= a.intValue();                                                                                                                                 
		
		System.out.println(b);
		
		int c=14;
		//Integer d=c;
		Integer d=Integer.valueOf(c);
		        
		System.out.println(d);
	}

}
