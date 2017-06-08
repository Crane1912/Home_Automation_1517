package HAS;

import static org.junit.Assert.*;

import org.junit.Test;

public class WashingMechineTest {

	@Test
	public void WashingCTest() {
		Washing_Mechine wc = new Washing_Mechine();
		int flag=wc.ONandOFF(0);
		assertEquals(1,flag);
	}
}
