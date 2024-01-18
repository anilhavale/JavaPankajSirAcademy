package Class14PSA_2;

public class B3 extends A3
{
	
	B3(int i)
	{
		System.out.println("The Argument Construcutor--");
		System.out.println("i = "+ i);
		System.out.println("The End of the Arg Constructor--");
	}
	B3()
	{
		System.out.println("B2");
	}

	public static void main(String[] args) 
	{
	
		new B3();
		new B3(250);
	}
}
