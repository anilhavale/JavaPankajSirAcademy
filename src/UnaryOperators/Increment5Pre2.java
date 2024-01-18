package UnaryOperators;

public class Increment5Pre2 {

	public static void main(String[] args) {
		// TODO Preincrement

		
		int i=10;
		i= i++;  // here 'i ' will be treted as one variable like 'j'
		
		System.out.println(" i : "+ i); //10
		
		
		int k=15;
		k=k++ + k++;
		
		System.out.println("k= "+k);
		
		
	}

}
