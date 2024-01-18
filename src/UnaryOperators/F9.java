package UnaryOperators;

public class F9 {

	{
		System.out.println("IIB-1");   //IIB
	}
	
	
	F9()
	{
		System.out.println(" From Constructor- - ");  //constructor
	}
	
	static	
	{
		int i=20;
		System.out.println("i = "+ i);    //SIB
	}
	
	
	{
		System.out.println("IIB-2");   //IIB
	}
	
	
	public static void main(String[] args)
	{ 
		System.out.println("The Main Start ****");
		 
		F9 f1 = new F9();
		 
		System.out.println("The Main End****");
		
	 
	}
	
	 
 
}
