package UnaryOperators;

public class Increment4 {

	public static void main(String[] args) {
		// TODO Preincrement

		
		int i=10;
		int j= i++ + ++i;
		
		System.out.println("i= "+i); // 12
		System.out.println("j= "+ j);//22
	}

}
