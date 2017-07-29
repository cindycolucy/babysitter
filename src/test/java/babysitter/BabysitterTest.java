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
		assertEquals(babysitter.isValidStartTime(startTime), false);
	}

	@Test
	public void whenStartTimeIsAfterFivePm() {
		int startTime = 18;
		assertEquals(babysitter.isValidStartTime(startTime), true);
	}

	@Test
	public void makeSureMyBedtimeIsTenPm() {
		assertEquals(babysitter.getBedtime(), 22);
	}

	@Test
	public void fromStartTimeToBedtimePaidCorrectly() {
		//int payment = 12;
		assertEquals(babysitter.getPayment(17, 22), 12);
	}
}
