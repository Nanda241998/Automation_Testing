package scanner_class;

import java.util.Scanner;

public class Scanner_nextFloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		float a = sc.nextFloat();
		System.out.println("Enter second Number:");
		float b = sc.nextFloat();

		float c = a + b;
		float d = a - b;
		float e = a * b;
		float f = a / b;
		float g = a % b;

		System.out.println("The value of a and b is:" + c);
		System.out.println("The value of a and b is:" + d);
		System.out.println("The value of a and b is:" + e);
		System.out.println("The value of a and b is:" + f);
		System.out.println("The value of a and b is:" + g);
	}

}
