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
		for(int currentTime = startTime; currentTime < endTime ||
                (endTime > 0 && endTime <= 4 && (currentTime - 24) < endTime); currentTime++) {
			if (currentTime <= bedtime) {
				hourlyPayment = 12;
			} else if (currentTime >= bedtime && currentTime <= 24) {
				hourlyPayment = 8;
			} else {
				hourlyPayment = 16;
			}
		}

		totalPayment += hourlyPayment;
		return totalPayment;
	}
}