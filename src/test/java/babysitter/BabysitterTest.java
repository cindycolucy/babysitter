package babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void whenStartTimeIsAfterFivePm() {
		Babysitter babysitter = new Babysitter();
		int startTime = 16;
		assertEquals(babysitter.isValidStartTime(startTime), false);
	}

}
