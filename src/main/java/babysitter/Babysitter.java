package babysitter;

public class Babysitter {

	private int bedTime = 22;

	public boolean isValidStartTime(int currentTime) {
		if (currentTime >= 17 || currentTime <= 4) {
			return true;
		}
		return false;

	}

	public int getBedTime() {

		return bedTime;
	}
}
