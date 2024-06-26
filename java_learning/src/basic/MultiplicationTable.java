package basic;

public class MultiplicationTable {
	void print() {
//		for (int i = 1; i <= 12; i++) {
//
//			System.out.println(5 + " * " + i + " = " + 5 * i);
//		}
		print(5); // we are using 3 print method object
	}

	void print(int table) {
//		for (int i = 1; i <= 12; i++) {
//
//			System.out.println(table + " * " + i + " = " + table * i);
//		}
		print(table, 1, 11); // we are using 3 print method object
	}

	void print(int table, int start, int end) {
		for (int i = start; i <= end; i++) {

			System.out.println(table + " * " + i + " = " + table * i);
		}
	}
}
