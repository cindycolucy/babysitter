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

	public void whenStartTimeIsAfterFivePm() {
		int startTime = 18;
		assertEquals(true, babysitter.isValidStartTime(startTime));
	}

	@Test
	public void makeSureMyBedtimeIsTenPm() {
		assertEquals(22, babysitter.getBedtime());
	}
	
	@Test
	public void fromStartTimeToBedtimePaidCorrectly() {
		assertEquals(12, babysitter.getPayment(17, 22));
	}
}
