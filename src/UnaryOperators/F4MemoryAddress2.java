package UnaryOperators;

public class F4MemoryAddress2 {

	int i=100;
	
	F4MemoryAddress2()
	{
		
		System.out.println("From Constructor");
	}
	
	public static void main(String[] args)
	{ 
		 System.out.println("The Address is : "+ new F4MemoryAddress2());
		 System.out.println("The Address is : "+ new F4MemoryAddress2().i);

	}
	
	public static void test()
	{
		System.out.println("The test is begin Good Luck()");
	}
 
}
