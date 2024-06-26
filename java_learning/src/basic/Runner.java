package basic;

public class Runner {

	public static void main(String[] args) {
		// MultiplicationTable table = new MultiplicationTable();
		// table.print();
		// table.print(10);
		// table.print(5, 11, 19);

//		TimeConverter time = new TimeConverter();
//		int res = time.convertHoursToMinutes(10);
//		int res2 = time.covertDaysToMinutes(2);
//		System.out.println(res);
//		System.out.println(res2);

//		ExamResult ex = new ExamResult();
//		// ex.isPass(50); // sout in that class itself
//		boolean res = ex.isPass(50);
//		System.out.println(res);

//		TriangleValidator tri = new TriangleValidator();
//		boolean res = tri.isValidTriangle(40, 40, 100);

//		RightTriangle rig = new RightTriangle();
//		rig.isRightAngles(3, 4, 6);

//		SumOfSquares sq = new SumOfSquares();
//		int a = sq.caluculateSumOfSquares(5);
//		System.out.println(a);

//		LeapYearChecker lp = new LeapYearChecker();
//		lp.isLeapYear(0);

		PerfectNumCheck pk = new PerfectNumCheck();
		boolean res = pk.isPerfectNumber(28);
		System.out.println(res);

	}
}
