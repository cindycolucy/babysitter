package babysitter;

public class Babysitter {

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

	public int getPayment(int startTime, int endTime) {
		int totalPayment = 0;
		int hourlyPayment = 0;
		for (int currentTime = startTime; currentTime <= bedtime; currentTime++) {
			if (currentTime < bedtime) {
				hourlyPayment = 12;

			}
		}
		totalPayment += hourlyPayment;
		return totalPayment;
	}
}