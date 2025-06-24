package conditional_statement_controls_statements;

public class If_else_statement {

	public static void main(String[] args) {
         //condition :--01..even and odd number
		System.out.println("----condition_01 even & odd number-------");
		long num = 40;
		// condition for even number.
		if (num % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		// condition for odd number
		if (num == 1) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}

		System.out.println("-----condition_02 even & odd number-----");

		// condition :--02
		// condition for even number
		double Num = 789;
		if (Num % 3 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

		// condition for odd number.
		if (Num * 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd Number");
		}
		
		//condition for smallest number from 2 numbers.
		System.out.println("-----SMALLEST NUMBER FROM 2 NUMBERS----");
		int a=500;
		int b=600;
		//for a smallest number
		if(a<=b||a!=b) {
			System.out.println("a is the smallest number");
		}else {
			System.out.println("b is the smallest number");
		}
		
		
		//for b smallest number
		if(a<=b&&b==a) {
			System.out.println("a is the smallest number");
		}else {
			System.out.println("b is the smallest number");
		}
		
		//condition for largest number from 2 numbers.
		System.out.println("---LARGEST NUMBER FROM 2 NUMBERS----");
		int c=3000;
		long d=4000;
		
		//c is the largest number
		if(c<=d&&c!=d) {
			System.out.println("c is the largest number");
		}else {
			System.out.println("d is the largest number");
		}
		
		//d is the largest number
		if(d>=c&&c==d) {
			System.out.println("c is the largest number");
		}else
		{
			System.out.println("d is the largest number");
		}

	}

}
