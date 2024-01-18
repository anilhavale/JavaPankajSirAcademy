package UnaryOperators;

public class F3 {

	
	F3()
	{
		System.out.println("From Constructor");
	}
	
	public static void main(String[] args)
	{ 
		F3.test();

		F3 c1=new F3();
		System.out.println("The Main is Begin()");
		
		c1.test();
		
		
	}

	public static void test() {
		// TODO Auto-generated method stub
		System.out.println("The test ()");
	}
}
