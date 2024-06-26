package basic;

public class TimeConverter {

	public int convertHoursToMinutes(int hours) {
		if (hours < 0) {
			return -1;
		}
		int minutes = hours * 60;
		return minutes;
	}

	public int covertDaysToMinutes(int days) {
		if (days < 0) {
			return -1;
		}
		int min = days * 24 * 60;
		return min;
	}
}
