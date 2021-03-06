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
	public void whenStartTimeIsBeforeFivePmStartTimeIsFalse() {
		int startTime = 16;
		assertFalse(babysitter.isValidStartTime(startTime));
	}
	
	@Test
	public void whenStartTimeIsAfterFivePmStartTimeIsTrue() {
		int startTime = 18;
		assertTrue(babysitter.isValidStartTime(startTime));
	}

	@Test
	public void makeSureMyBedtimeIsTenPm() {
		assertEquals(22, babysitter.getBedtime());
	}
	
	@Test
	public void fromStartTimeToBedtimePaidCorrectly() {
		assertEquals(12, babysitter.getPayment(17, 22));
	}
	
	@Test
	public void fromBedtimeToMidnightPaidCorrectly() {
		assertEquals(8, babysitter.getPayment(22, 24));
	}
	
	@Test
	public void fromMidnightToEndTimePaidCorrectly() {
		assertEquals(16, babysitter.getPayment(0, 4));
	}
}

