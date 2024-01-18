package UnaryOperators;

public class F {

	public static void main(String[] args) {

		F c1=new F();
	
		
		F c2 = new F(100);
		System.out.println("===========");
		F c3 = new F(200,"Anil");
		 	
	}
	
	public F() 
	{
	System.out.println("The Number of Argumetns:");
    }
	
	F(int i)
	{
		System.out.println("Inside the test () method");
		System.out.println("i = "+i);
	}
	
	F(int j, String s)
	{
		System.out.println("j= "+ j);
		System.out.println("s = "+s);
	}
}
