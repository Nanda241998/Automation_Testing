package conditional_statement_controls_statements;

public class If_else_if_statement {

	public static void main(String[] args) {
		//Person age amongst 3 age
		System.out.println("-----Person age amongst 3 age-----");
		int person_age = 25;
		int person_age_1 = 20;
		long person_age_2 = 18;

		// using logical and operator, condition 1 is true.//condition 2 is false.
		if (person_age >= person_age_1 && person_age_1 >= person_age_2) {
			System.out.println("Age is 25");
		} else if (person_age_1 >= person_age_2 && person_age_1 <= person_age) {
			System.out.println("Age is 20");
		} else {
			System.out.println("Age is 18");
		}
		
		//SMALLEST NUMBER FROM 3 NUMBERS

		System.out.println("-----SMALLEST NUMBER FROM 3 NUMBERS----");
		int a = 800;
		int b = 900;
		int c = 1000;
		// using logical OR operator
		if (a <= b || a <= c) {
			System.out.println("a is the smallest number");
		} 
		else if (b >= a || b == c) {
			System.out.println("b is the smallest number");
		} 
		else {
			System.out.println("c is the smallest number");
		}

	}

}
