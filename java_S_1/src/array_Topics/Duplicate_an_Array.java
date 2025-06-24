package array_Topics;

public class Duplicate_an_Array {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300, 300, 100, 3000, 200, 300, 400, 5000, 400, 5000, 3000 };
		int num = 300;
		int count = 0;

		for (int i : a) {
			if (i == num) {

				count++;
			}

		}
		System.out.println("The value of counted number is:" + count);

		String b[] = { "reverse", "return", "recursion", "reverse", "return", "recursion", "recursion" };
		String num_1 = "return";
		int count_1 = 0;
		for (String i : b) {
			if (i == num_1) {
				count_1++;

			}
		}
		System.out.println("the value of count of string is:" + count_1);

		float f[] = { 23.1f, 43.4f, 12.3f, 12.3f };
		float num2 = 12.3f;
		int count1 = 0;
		for (float i : f) {
			if (i == num2) {
				count1++;
			}

		}
		System.out.println("The value of count float is :" + count1);

	}
}
