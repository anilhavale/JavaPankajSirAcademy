package PracticeBasic;

public class App2 
{
	
	int i=20;
	int j=40;
	static int k=50;
	
	public static void main(String[] args) 
	{
		App2 a1 = new App2();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(App2.k);
	
		App2 a2 = new App2();
		System.out.println("======For a2 object=================");
		System.out.println(a2.i);
		System.out.println(a2.j);
		System.out.println("------");
		
	}
}



