package conditional_statement_controls_statements;

public class If_statement {

	public static void main(String[] args) {

		int score = 70;
		// if statement for true values.
		if (score >= 60) {
			System.out.println("Score is more as per requirement, great job.");
		}

		// if statement for false values.
		if (score <= 70) {
			System.out.println("Score is not matched as per requirement, need to work more");

		}

		int a = 200;
		// if statement for true values.
		if (a >= 100) {
			System.out.println("100 is greater than 200");
		}
		// if statement for false values.
		if (a <= 100) {
			System.out.println("100 is lesser than 200 ");

		}

	}

}
