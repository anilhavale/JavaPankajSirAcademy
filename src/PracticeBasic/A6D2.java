package PracticeBasic;


// 'Its not mandatory to initialize the non static variables,
//if we dont initialize it automaticaly get some default value from the compiler.

public class A6D2 
{
	 
	 int i;
	 static A6D2 a1;;
	 
	 public static void main(String[] args)
	{
		 
		 int j=99;
		 a1=new A6D2();
		 
		System.out.println("i= "+ a1.i);
		 A6D2.test();
		 a1.test();
		 
	}

	private static void test() {
		// TODO Auto-generated method stub
		
	/*	int k=25;
		//int j=90;
		A6D2 a2 = new A6D2();
		System.out.println("k = "+ k);
		
		System.out.println("-- i "+ a2.i);
		//System.out.println("-- j "+ j);
		*/
		
		System.out.println("j : "+j);
		
		
		
	}

	 


}
	 



