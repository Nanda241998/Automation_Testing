package nested_loops_types;

public class Inverted_Half_Pyramid {

	public static void main(String[] args) {
		// inverted half pyramid with numbers
		// 1 to 5 rows --outer loop
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		// 1 to 5 columns--inner loop
		for (int b = 5; b >= 1; b--) {
			for (int c = 1; c <= b; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("--------");

		// Inverted half pyramid with pattern

		// pattern
		for (int b = 5; b >= 1; b--) {
			for (int c = 1; c <= b; c++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
