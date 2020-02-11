
public class FizzBuzz {

	String generarUno(Integer n){
		return 
			// Es multiplo de 3 y 5 							 		
			(isModThree(n) && isModFive(n)) ? "FizzBuzz" : 
			// Es multiplo de 3			
			(isModThree(n)) ? "Fizz" : 
			// Es multiplo de 5
			(isModFive(n)) ? "Buzz" : 
			// Devuelve numero
			n.toString();
	}
	
	void generarMuchos(int n) {
		for(int i = 0; i < n; i++)
		{
			System.out.println(generarUno(i));
		}
	}
	
	boolean isModThree(int n) {
		return n % 3 == 0;
	}
	
	boolean isModFive(int n) {
		return n % 5 == 0;
	}
}
