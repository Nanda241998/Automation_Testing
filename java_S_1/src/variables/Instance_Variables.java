package variables;

public class Instance_Variables {
	// instance variable is inside the class and outside the method.

	int a = 56;

	// syntax for instance method.
	public void Instance_Method() {
		System.out.println(a);

	}

	// syntax for static method.
	public static void Static_Method() {
		Instance_Variables r = new Instance_Variables();
		System.out.println(r.a);
	}

	public static void main(String[] args) {

		// creating object to access the instance method.

		Instance_Variables r = new Instance_Variables();

		r.Instance_Method(); //output of instance_Method.
		Static_Method();     // output of static method.

	}

}
