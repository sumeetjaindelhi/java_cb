package lec_26;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Ac voltas=new Ac();
            Ac haier=new Ac();
            Ac lg =new Ac();
            
            System.out.println(voltas.fanspeed);
           voltas. fanspeed=100;
            System.out.println("voltas fanspeed"+" "+voltas.fanspeed);
           voltas.geton();
           System.out.println("voltas"+" "+voltas.ison);
           haier.geton();
           System.out.println("haier"+" "+haier.ison);
           lg.geton();
           System.out.println("lg"+" "+lg.ison);
           voltas.inctemp();
           haier.inctemp();
           lg.inctemp();
           System.out.println("voltas temperature"+" "+voltas.temp);
	}

}
