package PracticeBasic;


// 'Its not mandatory to initialize the static variables,
//if we dont initialize it automaticaly get soem defaut value from the compiler.

public class A2 
{
	static int i=10;
	static int j;
	
	static int k;

	public static void main(String[] args)
	{
		System.out.println(A2.i);
		A2 a1=new A2();
		a1.test();
	}

	public void test()
	{
		System.out.println("From Test Method");
		System.out.println("i= "+ A2.i);
		
		System.out.println(A2.j);
		System.out.println("k= "+k);
	}


}
	 



