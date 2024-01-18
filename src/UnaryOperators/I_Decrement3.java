package UnaryOperators;

public class I_Decrement3 {

	public static void main(String[] args) {

		int i=10;
		
		 int j= i++ + ++i; // 10++ + ++11= 10+12
		 
		 int k=--i+i++ + i--; // --12 + 11++ + 12--= 11+11+12=34
		 System.out.println(i); //11
		
		System.out.println("j= "+j);//22
		System.out.println("k= "+k); //34
		
		
	}

}
