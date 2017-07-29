package babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {

	@Test
	public void whenStartTimeIsBeforeFivePm() {
		Babysitter babysitter = new Babysitter();
		int startTime = 16;
		assertEquals(babysitter.isValidStartTime(startTime), false);
	}

	@Test
	public void whenStartTimeIsAfterFivePm() {
		Babysitter babysitter = new Babysitter();
		int startTime = 18;
		assertEquals(babysitter.isValidStartTime(startTime), true);
	}

	@Test
	public void makeSureMyBedtimeIsTenPm() {
		Babysitter babysitter = new Babysitter();
		int bedTime = 22;
		assertEquals(babysitter.getBedTime(), 22);
	}
}
