package basic;

public class SumOfSquares {

	public int caluculateSumOfSquares(int n) {
		if (n < 0) {
			return -1;
		}

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i * i;
		}
		return sum;
	}
}
