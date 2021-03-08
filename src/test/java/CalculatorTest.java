import static org.junit.Assert.*;

import org.junit.*;


public class CalculatorTest {
	@Test
	public void test_sqrt()
	{
		Calculator c = new Calculator();
		double x = c.sqrt(25);
		assertEquals(5.0,n,0.0);
		x = c.sqrt(3);
		assertEquals(1.7320508075688772,n,0.0);
	}
}