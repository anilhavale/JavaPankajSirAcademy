package UnaryOperators;

public class Increment5Pre {

	public static void main(String[] args) {
		// TODO Preincrement

		
		int i=10;
		int j= i++ + ++i ;  //10+12= 22//
				int k=i++ + ++i; //12+14=26
				int x= i++ + ++i; //14+16=30
		System.out.println("i= "+i); // 16
		System.out.println("j= "+ j);//22
		System.out.println("k = "+ k);//26
		
	}

}
