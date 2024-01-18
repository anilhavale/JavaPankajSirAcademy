package UnaryOperators;

public class F5 {

	int i=100;
	
	F5()
	{
		
		System.out.println("From Constructor1");
	}
	
	void F5()
	{
		System.out.println("The Method is Running:");
	}
	
	public static void main(String[] args)
	{ 
		
		   new F5().F5();
		   
		   F5.test();
		   System.out.println("--------------------------------");
		   
		   
		   F5 f1 = new F5();
		   f1.test();
		   System.out.println("================");
		   new F5();
		   System.out.println("11111111111111111111111111");
		   
		 //System.out.println("The Address is : "+ new F5());
		 //System.out.println("The Address is : "+ new F5().i);

	}
	
	public static void test()
	{
		System.out.println("The test is begin Good Luck()");
	}
 
}
