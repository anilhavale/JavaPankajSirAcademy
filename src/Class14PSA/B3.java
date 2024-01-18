package Class14PSA;

public class B3  extends A
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B3	b1=new B3();
		b1.test();
		b1.run();
		System.out.println("------------ ");
	}

	public void test()
	{
		System.out.println(super.j);   //A static member can be used inside the non static method
	}
	
	public static void run()
	{
		System.out.println(super.j);   // can not use super in the 'static' context
	}
}
