package nested_loops_types;

public class Hollow_Rectangle {

	public static void main(String[] args) {
		// hollow rectangle
		// rows--1 to 4 for outer loop
		// columns--1 to-5 for inner loop
		// 1 2 3 4 5
		// 1       5
		// 1       5
		// 1 2 3 4 5

		// printing with numbers
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a == 1 || a == 4 || b == 1 || b == 5) {
					System.out.print(b + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		// printing with the pattern
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a == 1 || a == 4 || b == 1 || b == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
