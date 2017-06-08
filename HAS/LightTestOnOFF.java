package HAS;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightTestOnOFF {

	@Test
	public void LightOnOFF() {
		Home_Lights hl = new Home_Lights();
		int flag=hl.ONandOFF(1);
		assertEquals(0,flag);
	}

}
