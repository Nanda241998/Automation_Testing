package loop_statement_control_statement;

public class For_loop_Statement {

	public static void main(String[] args) {
		System.out.println("---condition 1 to 10------");
		// condition 1 to 10
		for (int a = 1; a <= 10; a++) {
			System.out.println("values of a is:" + a);
		}
		System.out.println("----condition 10 to 1----");
		// condition 10 to 1
		for (int b = 10; b > 0; b--) {
			System.out.println("values of b is:" + b);
		}
		System.out.println("----even number 1 to 100----");
		// even number 1 to 100
		for (int c = 1; c <= 100; c++) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
		}
		System.out.println("----odd number 1 to 100----");
		// odd number 1 to 100
		for (int d = 1; d <= 100; d++) {
			if (d % 2 != 0) {
				System.out.println(d);
			}
		}
		System.out.println("----even number 1 to 100 --second way----");
		// even number 1 to 100 --second way
		for (int e = 1; e <= 100; e += 2) {
			System.out.println(e);
		}
		System.out.println();
		// even number from 100 to 1
		for (int f = 100; f > 100; f--) {
			if (f % 2 == 0) {
				System.out.println(f);
			}
		}
		// print 1 to 25 table
		System.out.println("------------");
		for (int g = 1; g <= 25; g++) {
			System.out.println(g * 5);
		}
		// format 5*f=5
		System.out.println("---------------");
		for (int h = 1; h <= 25; h++) {
			System.out.println("5*" + h + "=" + (5 * h));
		}
		// even and odd number
		System.out.println("------------- ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even number:" + i);
			} else {
				System.out.println("odd number:" + i);
			}
		}

		// print table in the format of
		System.out.println("------------------------");
		for (int j = 1; j <= 25; j++) {
			System.out.println("j*" + j + "=" + (j * 2));
		}

	}

}
