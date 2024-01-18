package UnaryOperators;

public class argumentsPassing {

	public static void main(String[] args) {

	
		
		argumentsPassing r1= new argumentsPassing();
		r1.test(10,"test()");
		
		 	
	}

	public void  test(int i, String s)
	{
		System.out.println("Inside the test () method");
		System.out.println("i = "+i);
		System.out.println("String: "+ s);
//	 return ;
	}
}
