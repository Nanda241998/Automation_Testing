package scanner_class;

import java.util.Scanner;

public class Scanner_NextLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		String a = sc.nextLine();
		System.out.println("Enter second String:");
		String b = sc.nextLine();

		System.out.println("The value of two Strings:" + a.concat(" " + b));

		System.out.println("-------------");
		System.out.println("Enter third String:");
		String s = sc.nextLine();
		System.out.println("String printed upto five times:");
		for (int i = 1; i <= 5; i++) {
			System.out.println(s);

		}

		System.out.println("-----------");
		System.out.println("Enter fourth String:");
		String o = sc.nextLine();
		System.out.println("Output is as follow:");
		int p = 1;
		while (p <= 5) {
			System.out.println(o);
			p++;
		}

	}

}
