package UnaryOperators;

public class F11 {

	 F11()
	{
		System.out.println(" From Constructor- - ");  //constructor
	}
	
	 {
		int i=20;
		System.out.println("i = "+ i);  //SIB
		System.out.println("-----------------------------");
		new F11();
	}
	
	 
	{
		System.out.println("IIB-3");   //IIB3
	}
	
	
	public static void main(String[] args)
	{ 
		System.out.println("The Main Start ****");
		 
		F11 f1 = new F11();
		 
		System.out.println("The Main End****");
	}
}
