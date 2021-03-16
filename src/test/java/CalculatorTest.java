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
		x = c.sqrt(-3);
		assertEquals(Double.NaN,x,0.0);
	}

	@Test
	public void testFactorial()
	{
		Calculator c = new Calculator();
		double x = c.factorial(0);
		assertEquals(1,x,0.0);
		x = c.factorial(5);
		assertEquals(120.0,x,0.0);
		x = c.factorial(1);
		assertEquals(1.0,x,0.0);
		x = c.factorial(-5);
		assertEquals(Double.NaN,x,0.0);
	}

	@Test
	public void testLogarithm()
	{
		Calculator c = new Calculator();
		double x = c.ln(1);
		assertEquals(0.0,x,0.0);
		x = c.ln(4);
		assertEquals(1.3862943611198906,x,0.001);
		x = c.ln(0);
		assertEquals(Double.NaN,x,0.001);
		x = c.ln(10);
		assertEquals(2.302585092994046,x,0.001);
	}

	@Test
	public void testPower()
	{
		Calculator c = new Calculator();
		double x = c.power(2,3);
		assertEquals(8.0,x,0.0);
		x = c.power(-1,1);
		assertEquals(-1.0,x,0.0);
		x = c.power(0,1);
		assertEquals(0.0,x,0.0);
		x = c.power(-1,-1);
		assertEquals(-1.0,x,0.0);
	}
}
