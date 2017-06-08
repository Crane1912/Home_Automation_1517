package HAS;

import static org.junit.Assert.*;

import org.junit.Test;

public class ACTest {

	@Test
	public void ACTest() {
		Air_Conditioner ac = new Air_Conditioner();
		int flag=ac.ONandOFF(0);
		assertEquals(1,flag);
	}

}
