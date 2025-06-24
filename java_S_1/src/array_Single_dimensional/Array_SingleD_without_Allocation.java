package array_Single_dimensional;

public class Array_SingleD_without_Allocation {

	public static void main(String[] args) {
		int digits[] = { 78, 34, 56, 67, 54, 34 };
		for (int i : digits) {
			System.out.println(i);
		}
		System.out.println("length of digits is:" + digits.length);

		System.out.println("index of digits is:" + digits[3]);

		System.out.println("-----using for loop----");
		for (int j = 0; j < digits.length; j++) {
			System.out.println(digits[j]);
		}
	}

}
