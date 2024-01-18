package UnaryOperators;

public class F2 {

	
	F2()
	{
		System.out.println("From Constructor");
	}
	
	public static void main(String[] args)
	{

		F2 c1=new F2();
		System.out.println("The Main is Begin()");
		
		c1.test();
		
		
	}

	private void test() {
		// TODO Auto-generated method stub
		System.out.println("The test ()");
	}
}
