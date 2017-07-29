package babysitter;

public class Babysitter {

	public boolean isValidStartTime(int currentTime) {
		if (currentTime >= 17 || currentTime <= 4) {
			return true;
		}
		return false;

	}
}
