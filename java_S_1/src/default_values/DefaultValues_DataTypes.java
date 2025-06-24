package default_values;

import java.lang.reflect.Array;

public class DefaultValues_DataTypes {

	/*
	 * primitive data types:- numeric: 1.integer data types
	 */
	int d;
	byte k;
	short j;
	long r;

	// 2.floating data types
	float e;
	double w;

	// non-numeric data types
	char q;
	boolean b;

	// non-primitive data types.
	String s;
	Array[][] l;

	public static void main(String[] args) {
		DefaultValues_DataTypes h = new DefaultValues_DataTypes();

		// output printing for primitive data types of numeric integer type.
		System.out.println("Default value of integer data type int:" + h.d);
		System.out.println("Default value of integer data type byte:" + h.k);
		System.out.println("Default value of integer data type short:" + h.j);
		System.out.println("Default value of integer data type long:" + h.r);

		// output printing for primitive data types of numeric floating data type.
		System.out.println("Default value of floating data type float:" + h.e);
		System.out.println("Default value of floating data type Double:" + h.w);

		// output printing for primitive data types of non-numeric data type.
		System.out.println("Default value of non-numeric data type char:" + h.q);
		System.out.println("Default value of non-numeric data type boolean:" + h.b);

		// output printing for non-primitive data types.
		System.out.println("Default value of string:" + h.s);
		System.out.println("Default value of array:" + h.l);

	}

}
