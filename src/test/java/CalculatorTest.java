import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSqrt() {
		Calculator c = new Calculator();
		double x = c.sqrt(25);
		assertEquals(5.0,x,0.0);
		x = c.sqrt(3);
		assertEquals(1.7320508075688772,x,0.0);
	}

	@Test
	public void testFactorial()
	{
		Calculator c = new Calculator();
		double n = c.factorial(0);
		assertEquals(1,n,0.0);
		n = c.factorial(5);
		assertEquals(120,n,0.0);
	}

}
