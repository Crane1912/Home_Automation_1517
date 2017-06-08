package HAS;

import static org.junit.Assert.*;

import org.junit.Test;

public class TVTest {
	TV tv = new TV();
	@Test
	public void Tv_Test() {
		int flag=tv.ONandOFF(0);
		assertEquals(1,flag);
	}
	
	@Test
	public void TV_VolUp() {

		int flag=tv.volUp();
		assertEquals(11,flag);
	}
	
	@Test
	public void TV_VolDown() {

		int flag=tv.volDown();
		assertEquals(9,flag);
	}

	
	@Test
	public void TV_ChanUp() {

		int flag=tv.channelUp();
		assertEquals(1,flag);
	}
}
