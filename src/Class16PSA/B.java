package Class16PSA;
import Class15PSA.*;


public class B {

	B()
	{
		System.out.println("B() Constructor Begin-");
	}
	public static void main(String[] args) {
		
		new B();
		A a1=new A();
		System.out.println("a1: "+a1.i);
		
		A1 a11 = new A1();
		a11.test();
	}
}
