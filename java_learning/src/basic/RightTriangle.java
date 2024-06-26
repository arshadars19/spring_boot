package basic;

public class RightTriangle {
	public boolean isRightAngles(int side1, int side2, int side3) {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}

		if (side1 * side1 + side2 * side2 == side3 * side3) {
			System.out.println("is a right triangel");
			return true;
		}
		if (side2 * side2 + side3 * side3 == side1 * side1) {
			System.out.println("is a right triangel");
			return true;
		}
		if (side3 * side3 + side1 * side1 == side2 * side2) {
			System.out.println("is a right triangel");
			return true;
		}
		System.out.println("is not ");
		return false;

	}
}
