
public class FizzBuzz {

	String generarUno(Integer n){
		String str;
		if (n % 3 == 0 && n % 5 == 0)
		{
			str = "FizzBuzz";                    
		}
		else 
			if(n % 3 == 0)
			{
				str = "Fizz";
			}
			else 
				if(n % 5 == 0)
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
	
}
