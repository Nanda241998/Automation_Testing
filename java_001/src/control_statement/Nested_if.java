package control_statement;

public class Nested_if {

	public static void main(String[] args) {
		int temperature = 45;

		if (temperature < 20) {
			System.out.println("temperature 50");
			if (temperature > 20) {
				System.out.println("temperature 20");
				if (temperature < 30) {
					System.out.println("temperature 30");
				}
			}
		} else {
			System.out.println("temperature is invalid");
		}

	}

}
