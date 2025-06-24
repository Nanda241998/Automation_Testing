package scanner_class;

import java.util.Scanner;

public class Scanner_nextcharAt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first character:");
		char a = sc.next().charAt(0);
		
		switch (a) {
		case '-':
			System.out.println("Entered char values:"+"Subtraction");
			break;
		case '+':
			System.out.println("Entered char values:"+"Addition");
			break;
		case '*':
			System.out.println("Entered char values:"+"Multiplication");
			break;
		case '/':
			System.out.println("Entered char values:"+"Division");
			break;
		case '%':
			System.out.println("Entered char values:"+"Modulus");
			break;
		case 's':System.out.println("Entered char values:"+a);break;
		default:
			System.out.println("output not found");
			break;
		}

	}

}
