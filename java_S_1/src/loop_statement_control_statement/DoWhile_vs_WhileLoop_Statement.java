package loop_statement_control_statement;

public class DoWhile_vs_WhileLoop_Statement {

	public static void main(String[] args) {
		
		//difference in while and do while is that when we want only one exact output then we can use do loop.
		//in while loop if our condition is greater than the given value in condition then the JVM will not give the output.

		System.out.println("--using while statement----");
		int a = 20;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		System.out.println("---using do-while statement-----");
		int b = 20;
		do {
			System.out.println(b);
			b++;
		} while (b <= 10);

	}

}
