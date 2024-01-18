package Class17;

public class C {
	
	int i=10;
	
	public void test()
	{
		System.out.println("inside Test::::");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		C c1= new C();
		System.out.println(c1.i);
		c1.test();
		System.out.println("====================");
		C.test1();
		
	}

	public static void test1()
	{
		System.out.println("--Inside the Test 1() --");
	}
}
