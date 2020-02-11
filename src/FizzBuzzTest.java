import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void testWithOne() {
		assertEquals("1", fb.generarUno(1));
	}

	@Test
	public void testWithThree() {
		assertEquals("Fizz", fb.generarUno(3));
	}
	
	@Test
	public void testWithFive() {
		assertEquals("Buzz", fb.generarUno(5));
	}
	
	@Test
	public void testWithFifteen() {
		assertEquals("FizzBuzz", fb.generarUno(15));
	}
	
	

}
