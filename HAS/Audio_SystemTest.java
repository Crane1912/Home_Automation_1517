package HAS;

import static org.junit.Assert.*;

import org.junit.Test;

public class Audio_SystemTest {

	@Test
	public void AudioSystemTest() {
		Audio_System as = new Audio_System();
		int flag=as.ONandOFF(0);
		assertEquals(1,flag);
	}

}
