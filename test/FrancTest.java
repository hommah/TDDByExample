import static org.junit.Assert.*;

import org.junit.Test;


public class FrancTest {

	@Test
	public void testFrancMultiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15),five.times(3));
	}
	@Test
	public void testEquality() throws Exception {
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
	}

}
