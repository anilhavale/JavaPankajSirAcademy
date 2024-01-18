package UnaryOperators;

public class I_Decrement1 {

	public static void main(String[] args) {

		int i=10;
		i= i--;  // here 'i ' will be treted as one variable like 'j'
		
		System.out.println(" i : "+ i); //10
		
		
		int k=15;
		k=k-- + k++; //29
		
		System.out.println("k= "+k);
		
		
	}

}
