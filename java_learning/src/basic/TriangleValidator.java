package basic;

public class TriangleValidator {
	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		int angle = angle1 + angle2 + angle3;
		if (angle == 180) {
			System.out.println("triangle ");
			return true;
		}
		System.out.println("not triangle");
		return false;
	}

}
