package operators;

public class Comparison_Operators {
	// declaring variables
	int a = 23;
	int b = 56;

	boolean c = a > b; // greater than.
	boolean d = a < b; // less than.
	boolean e = (a >= b); // greater than equal to.
	boolean f = (a <= b); // less than equal to.
	boolean g = (a == b); // equals to.
	boolean h = (a != b); // not equals to.
	// declaring variable for static method using static keyword.
	static int i = 34;
	static int j = 67;

	// instance method to printing outputs of inside the class and outside the
	// method.

	public void instance_method() {

		// printing output for greater than operator.
		System.out.println("instance method:----greater than output:-------");
		System.out.println("the value of a & b using greater than operators:" + (a > b)); // one way to declared the
																							// outputs.
		System.out.println("the value of a & b using greater than operators:" + c);// second way to declared the
																					// outputs.
		// printing output for less than operator.
		System.out.println("instance method:---less tha output:--------");
		System.out.println("the value of a & b using less than operators:" + (a < b)); // one way to declared the
																						// outputs.
		System.out.println("the value of a & b using less than operators:" + d);// second way to declared the outputs.
		// printing output for greater than equal to operator.
		System.out.println("instance method:------greater than equal to  output:-------");
		System.out.println("the value of a & b using greater than equal to operators:" + (a >= b)); // one way to
																									// declared the
		// outputs.
		System.out.println("the value of a & b using greater than equal to operators:" + e);// second way to declared
																							// the outputs.

		// printing output for less than equal to operator.
		System.out.println("instance method:------less than equal to output:--------");
		System.out.println("the value of a & b using less than equal to operators:" + (a <= b)); // one way to declared
																									// the outputs.

		System.out.println("the value of a & b using less than equal to operators:" + f);// second way to declared the
																							// outputs.
		// printing output for equals to operator.
		System.out.println("instance method:-----equals to output:---------");
		System.out.println("the value of a & b using equals to operators:" + (a == b)); // one way to declared the
																						// outputs.
		System.out.println("the value of a & b using equals to operators:" + g);// second way to declared the outputs.

		// printing output for not equal to operator.
		System.out.println("instance method:-------not equal to output:--------");
		System.out.println("the value of a & b using not equal to operators:" + (a != b)); // one way to declared the
																							// outputs.
		System.out.println("the value of a & b using not equal to operators:" + h);// second way to declared the
																					// outputs.
	}

	// static method to printing the outputs of inside the class and outside the
	// method.
	public static void static_method() {
		// printing output for greater than.
		System.out.println("output for static method______greater than output:------");
		System.out.println("the value of i &j using greater than operator:" + (i > j));

		// printing output for less than.
		System.out.println("static method:-----less than output ");
		System.out.println("the value of i &j using less than operator:" + (i < j));

		// printing output for greater than or equal to.
		System.out.println("static method:----greater than or equal to output");
		System.out.println("tha value of i&j using greater than or equal to :" + (i > j));

		// printing output for less than equal to operator.
		System.out.println("static method:------less than equal to output:--------");
		System.out.println("the value of i & j using less than equal to operators:" + (i <= j));

		// printing output for equals to operator.
		System.out.println("static method:-----equals to output:---------");
		System.out.println("the value of i& j using equals to operators:" + (i == j));

		// printing output for not equal to operator.
		System.out.println("static method:-------not equal to output:--------");
		System.out.println("the value of i & j using not equal to operators:" + (i != j));
	}

	public static void main(String[] args) {
		// creating objects for instance method to access the variables which is inside
		// the class and outside the method.
		Comparison_Operators r = new Comparison_Operators();
		r.instance_method();
		static_method();

	}

}
