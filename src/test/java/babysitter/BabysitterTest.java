package babysitter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabysitterTest {
	
	Babysitter babysitter;
	
	@Before
	public void setup() {
		babysitter = new Babysitter();
	}

	@Test
	public void whenStartTimeIsBeforeFivePm() {
		int startTime = 16;
		assertEquals(false, babysitter.isValidStartTime(startTime));
	}

	
}
