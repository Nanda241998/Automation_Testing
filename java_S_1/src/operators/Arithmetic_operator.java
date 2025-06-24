package operators;

public class Arithmetic_operator {

	public static void main(String[] args) {

		// addition
		long a = 90;
		int b = 78;
		System.out.println("the value of a & b is:"+a + b);

		// Subtraction
		byte d = 79;
		int c = 45;

		int e = d - c;
		boolean h = (d < c);
		System.out.println("the value of d&c is:"+e);
		System.out.println("the value of d&c in using boolean data type:"+h);

		// multiplication

		int f = 56;
		float w = 87.08f;

		float s = f * w;
		System.out.println("the value of f&w using floating data type is:"+s);

		// division

		int l = 24;
		short k = 6;
		// use forward slash when we want quotient.
		System.out.println("the value of l & k using division is:"+l / k);
		// use modulus when we want reminder.
		System.out.println("the value of l&k using modulus is:"+l % k);

		// increment

		int g = 45;

		System.out.println("the value of increment variable is:" +(++g));
		System.out.println(g++);
		System.out.println(g++);

		// decrement

		short p = 67;
		System.out.println("the value of decrement variable is:"+(--p));

		System.out.println(++p);
		
		int o=50;
		System.out.println(o++);
		System.out.println(--o);
		System.out.println(++o);
		System.out.println(++o);
		System.out.println(o--);
		System.out.println(o--);
		System.out.println(++o);
		System.out.println(o++);
		
	}

}
