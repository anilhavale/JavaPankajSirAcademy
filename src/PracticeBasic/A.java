package PracticeBasic;

public class A 
{
	
	int i=20;
	int j=40;
	static int k=50;
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		//System.out.println(i);
		
		a1.test();
	}

	public void test()
	{
		System.out.println("From Test Method");
		System.out.println("i= "+ i);
	}
}



