package Class13PSA;

public class A2 {

	int a=20;
	
	public static void main(String[] args) 
	{
	
	  A2	a1=new A2();
		System.out.println(a1);
		System.out.println("---------------");
		System.out.println("a1.a="+a1.a);
		a1.test();
		
	}

	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("this keyword value: "+this);
	}
}
