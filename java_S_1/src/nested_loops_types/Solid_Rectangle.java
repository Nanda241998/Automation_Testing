package nested_loops_types;

public class Solid_Rectangle {

	public static void main(String[] args) {
		// pattern solid rectangle
		// rows in outer loop....1 to 4

		// columns in inner loop.....1 to 5
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------");
		// solid rectangle number
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}
}
