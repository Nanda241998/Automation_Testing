package array_Single_dimensional;

public class Array_Float_without_allocation {

	public static void main(String[] args) {
		float numbers[] = { 12.3f, 45.3f, 54.5f, 54.5f };
		for (float i : numbers) {
			System.out.println(i);
		}
		System.out.println("length of number is:" + numbers.length);
		System.out.println("index of numbers is:" + numbers[3]);

		System.out.println("-----using for loop----");
		for (int j = 0; j < 4; j++) {
			System.out.println(numbers[j]);
		}

	}

}
