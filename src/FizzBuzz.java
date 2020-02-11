
public class FizzBuzz {

	String generarUno(Integer n){
		
		String str;
		
		if (isModThree(n) && isModFive(n))
		{
			str = "FizzBuzz";                    
		}
		else 
			if(isModThree(n))
			{
				str = "Fizz";
			}
			else 
				if(isModFive(n))
				{
					str = "Buzz";
				}
				else
					str = n.toString();
		return str;
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
