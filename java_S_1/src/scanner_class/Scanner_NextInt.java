package scanner_class;

import java.util.Scanner;

public class Scanner_NextInt {

	public static void main(String[] args) {
		// scanner class is used to print input and output in console
		// using nextInt
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:-");
		int a = sc.nextInt();
		System.out.println("Enter second number:-");
		int b = sc.nextInt();
		System.out.println("Enter third number:-");
		int h = sc.nextInt();

		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		int g = a % b;

		System.out.println("The addition of two numbers:- " + c);
		System.out.println("The subtraction of two numbers:- " + d);
		System.out.println("The multiplication of two numbers:- " + e);
		System.out.println("The division of two numbers:- " + f);
		System.out.println("The modulus of two numbers:- " + g);
		System.out.println("The increment value of h:- " + (h++));
		System.out.println("The increment value of h:- " + (--h));
		System.out.println("The increment value of h:- " + (++h));
		
		
		
		System.out.println("-----------------");
		// print table of 7
		// 1 to 10
		System.out.println("The value of table:");
		int j = sc.nextInt();
		System.out.println("Table of 7 as follow");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * j);
		}

		
		
		System.out.println("-----------------");
		// print table of 7
		// 1 to 10
		System.out.println("The value of table:");
		int k = sc.nextInt();
		System.out.println("Table of 7 as follow");
		for (int l = 1; l <= 10; l++) {
			System.out.println("7" + "*" + l + "= " + (k * l));
		}

	}

}
