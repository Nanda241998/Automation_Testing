package scanner_class;

import java.util.Scanner;

public class Scanner_NextDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		double a = sc.nextDouble();
		System.out.println("Enter second number: ");
		double b = sc.nextDouble();

		double c = a + b;
		double d = a - b;
		double e = a * b;
		double f = a / b;
		double g = a % b;

		System.out.println("The addition of two value:- " + c);
		System.out.println("The substraction of two value:- " + d);
		System.out.println("The multiplication of two values:- " + e);
		System.out.println("The division of two values:-" + f);
		System.out.println("The modulus of two values:-" + g);

		// table
		System.out.println("Enter third number:");
		double h = sc.nextDouble();

		while (h < 34) {
			System.out.println("less than 34 values:" + h);
			h++;
		}

	}

}
