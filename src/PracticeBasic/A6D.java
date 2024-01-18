package PracticeBasic;


// 'Its not mandatory to initialize the non static variables,
//if we dont initialize it automaticaly get some default value from the compiler.

public class A6D 
{
	 
	 int i;
	 static int j;
	 
	 public static void main(String[] args)
	{
		 
		A6D a1=new A6D();
		 
		System.out.println("j= "+ a1.j);
		System.out.println("------ "+ a1.i);
		A6D.test();
	}

	private static void test() {
		// TODO Auto-generated method stub
		
		int k=25;
		int j=90;
		A6D a2 = new A6D();
		System.out.println("k = "+ k);
		
		System.out.println("-- i "+ a2.i);
		System.out.println("-- j "+ j);
		
		
	}

	 


}
	 



