import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSqrt() {
		Calculator c = new Calculator();
//		fail("Not yet implemented");
		double x = c.sqrt(25);
		assertEquals(5.0,n,0.0);
		x = c.sqrt(3);
		assertEquals(1.7320508075688772,n,0.0);
	}

}
