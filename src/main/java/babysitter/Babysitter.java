package babysitter;

public class Babysitter {

	//private int startTime = 17;
	private int bedtime = 22;

	public boolean isValidStartTime(int currentTime) {
		if ((currentTime >= 17 && currentTime <= 24) || (currentTime > 0 && currentTime <= 4)) {
			return true;
		}
		return false;

	}

	public int getBedtime() {
		return bedtime;
	}

	
}
