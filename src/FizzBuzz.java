
public class FizzBuzz {

	void generarUno(Integer n){
		if (n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("FizzBuzz");                    
		}
		else 
			if(n % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else 
				if(n % 5 == 0)
				{
					System.out.println("Buzz");
				}
				else
					System.out.println(n);
	}
	
	void generarMuchos() {
		for(int i = 0; i < 100; i++)
		{
			generarUno(i);
		}
	}
	
}
