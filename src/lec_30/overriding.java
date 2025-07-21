package lec_30;
class A{
	int a=12;
	void fun() {
		System.out.println("hello from A");
	}
}
class B extends A{
	int b=13;
	void fun() {
		System.out.println("hello from B");
	}
} 
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              A obj=new B();
              System.out.println(obj.a);
               obj.fun(); 
	}

}
