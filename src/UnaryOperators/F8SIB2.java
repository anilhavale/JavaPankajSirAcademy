package UnaryOperators;

public class F8SIB2 {

	{
		System.out.println("IIB-1");
	}
	
	
	F8SIB2()
	{
		System.out.println(" From Constructor- - ");
	}
	
	static	
	{
		int i=20;
		System.out.println("i = "+ i);
		System.out.println("-SIB1-");
		System.out.println("=========================");
	}
	
	static	
	{
		int i=30;
		System.out.println("i = "+ i);
		System.out.println("-SIB2-");
	}
	public static void main(String[] args)
	{ 
		System.out.println("The Main Start ****");
		 
		F8SIB2 f1 = new F8SIB2();
		 
		System.out.println("The Main End****");
		
	 
	}
	
	 
 
}
