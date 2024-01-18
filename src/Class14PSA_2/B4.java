package Class14PSA_2;

public class B4 extends A3
{
	
	B4()  // super keyword is automatically placed.	
	{
		System.out.println("B2");
	}
	
	B4(int i)
	{
		
		this();   // super keyword will not be placed automatically
		System.out.println("The Argument Construcutor--");
		System.out.println("i = "+ i);
		System.out.println("The End of the Arg Constructor--");
	}
	

	public static void main(String[] args) 
	{
	
		//new B4();
		new B4(250);
	}
}
