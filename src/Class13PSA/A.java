package Class13PSA;

public class A {

	int a=20;
	
	public static void main(String[] args) 
	{
	
	  A	a1=new A();
	  A  a2= new A();
		System.out.println(a1);
		System.out.println(a2);
		 a1.test();
		
	}

	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("this keyword value: "+this);
	}
}
