package lec_26;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Ac voltas=new Ac();
         
         System.out.println(voltas.temp);
         System.out.println(voltas.ison);
         
         voltas.geton();
         System.out.println(voltas.ison);
         
         voltas.fanspeed=100;
         System.out.println(voltas.fanspeed);  
          
         }

}
