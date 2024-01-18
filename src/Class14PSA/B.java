package Class14PSA;

public class B  extends A
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B	b1=new B();
		b1.test();
		System.out.println("------------ ");
	}

	public void test()
	{
		System.out.println(super.i);
	}
}
