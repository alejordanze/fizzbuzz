import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void testWithOne() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1", fb.generarUno(1));
	}

	@Test
	public void testWithThree() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.generarUno(3));
	}
	
	@Test
	public void testWithFive() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.generarUno(5));
	}

}
