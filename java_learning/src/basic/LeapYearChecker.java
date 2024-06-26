package basic;

public class LeapYearChecker {
	public boolean isLeapYear(int year) {
		if (year < 1) {// 0
			System.out.println("its 0 year ");
			return false;
		}

		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("leap year");
			return true;
		}
		if (year % 100 != 0) {
			System.out.println("leap year");
			return true;
		}
		if (year % 400 != 0) {
			System.out.println(" not leap year");
			return false;
		}
		System.out.println("not leap year");
		return false;
	}

}
