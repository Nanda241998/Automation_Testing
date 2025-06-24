package method_overloading_polymorphism;

public class Manual_Testing {
	
	public void unit_testing() {
		this.integration_testing(23);
		this.integration_testing(23.4f, 30.4);
		this.integration_testing("software");
		this.integration_testing(34, 50);
		System.out.println("unit testing done by the developer in the form of coding");
	}
	public void integration_testing(int a) {
		System.out.println("integration testing is done by the developer it integrats the application ");
	}
	
	public void integration_testing(int a, int b) {
		System.out.println("Uat testing is done by the end of customer");
	}
	
	public void integration_testing(float f,double d) {
		System.out.println("performance testing is done to check security and speed");
	}
	
	public void integration_testing(String s) {
		System.out.println("retesting is done to retest and recheck the application");
	}
	
	public static void integration_testing(String e, float r) {
		System.out.println("regression testing is done to check that any impact on existing functionality or not");
	}

	public static void main(String[] args) {
		Manual_Testing t= new Manual_Testing();
		/*t.integration_testing(23);
		t.Performance_Testing(23.4f, 30.4);
		t.Retesting("software");
		t.UAT_Testing(34, 50);*/
		t.unit_testing();
		integration_testing("java", 45.5f);

	}

}
