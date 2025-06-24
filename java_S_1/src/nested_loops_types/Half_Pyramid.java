package nested_loops_types;

public class Half_Pyramid {

	public static void main(String[] args)
	// half pyramid with numbers
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5
	// 5 rows in outer loop
	// 1 column in inner loop
	{
		for (int d = 1; d <= 5; d++) {
			for (int g = 1; g <= d; g++) {
				System.out.print(g + " ");
			}
			System.out.println();
		}
		System.out.println("------");

		// pattern of inverted half pyramid with pattern
		for (int d = 1; d <= 5; d++) {
			for (int g = 1; g <= d; g++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
