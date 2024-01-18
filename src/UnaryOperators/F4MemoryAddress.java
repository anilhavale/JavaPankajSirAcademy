package UnaryOperators;

public class F4MemoryAddress {

	int i=100;
	
	F4MemoryAddress()
	{
		
		System.out.println("From Constructor");
	}
	
	public static void main(String[] args)
	{ 
		 System.out.println("The Address is : "+ new F4MemoryAddress());
		 System.out.println("The Address is : "+ new F4MemoryAddress().i);

	}
 
}
