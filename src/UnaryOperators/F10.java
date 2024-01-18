package UnaryOperators;

public class F10 {

	 F10()
	{
		System.out.println(" From Constructor- - ");  //constructor
	}
	
	static	
	{
		int i=20;
		System.out.println("i = "+ i);  //SIB
		System.out.println("-----------------------------");
	}
	
	static
	{
		new F10();
		System.out.println("The SIB Block:===");
	}
	
	
	{
		System.out.println("IIB-1");   //IIB1
	}
	
	
	{
		System.out.println("IIB-2");   //IIB2
	}
	
	{
		System.out.println("IIB-3");   //IIB3
	}
	
	public static void main(String[] args)
	{ 
		System.out.println("The Main Start ****");
		 
		F10 f1 = new F10();
		 
		System.out.println("The Main End****");
		
	 
	}
	
	 
 
}
