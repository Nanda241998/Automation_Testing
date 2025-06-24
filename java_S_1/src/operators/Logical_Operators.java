package operators;

public class Logical_Operators {

	// variables for logical operator.
	int a = 77;
	int b = 88;

	// LOGICAL && AND OPERATOR.
	// true..true--true

	boolean c = (b > a && a < b);

	// true..false--false
	boolean d = (b > a && b < a);

	// false..true--false
	boolean e = (b == a && a < b);

	// false..false--false
	boolean f = (a > b && b == a);

	// LOGICAL OR '||' OPERATOR
	// true...true..true
	boolean g = (a != b || b != a);

	// true..false..true
	boolean h = (a != b || b == a);

	// false..true..true
	boolean i = (a <= b || b >= a);

	// false..false.false
	boolean j = (a >= b || a == b);

	// LOGICAL NOT ! OPERATOR
	// condition:-- false..true
	boolean k = !(a > b);

	// condition:-- true..false
	boolean l = !(a != b);

	public void instance_method() {

		// logical && operator
		System.out.println("**INSTANCE METHOD**");
		System.out.println("*****logical and '&&'******");

		// condition:- true..true..true
		System.out.println("---------condition true..true..true------");
		System.out.println("the value of D using AND method with the condition of true..true..true:-- " + c);

		// condition:- true..false..false
		System.out.println("-------condition:- true..false..false-------");
		System.out.println("the value of E using AND method with the condition of true..false.false:-- " + d);

		// condition:- false..true..false
		System.out.println("-------condition:- false..true..false-------- ");
		System.out.println("the value of F using AND method with the condition of false..true..false:-- " + e);

		// condition:- false..false..false
		System.out.println("--------condition:- false..false..false------");
		System.out.println("the value of G using AND method with the condition of false..false..false:-- " + f);

		// logical or operator
		System.out.println("******logical OR '||'*******");

		// condition:- true true..true
		System.out.println("--------condition:- true true..true------");
		System.out.println("the value of g using or method with the condition of true..true..true:-- " + (g));

		// condition:- true false..true
		System.out.println("--------condition:- true false..true-------");
		System.out.println("the value of g using or method with the condition of true..false..true:-- " + (h));
		// condition :- false true..true
		System.out.println("--------condition :- false true..true-------");
		System.out.println("the value of g using or method with the condition of false..true..true:-- " + (i));

		// condition:- false..false..false
		System.out.println("------condition:- false..false..false-------");
		System.out.println("the value of g using or method with the condition of false..false..false:----- " + (j));

		// LOGICAL NOT '!' OPERATORS.

		System.out.println("*****Logical NOT !*****");

		// condition:- false..true
		System.out.println("-------condition:- false..true------");
		System.out.println("the value of k using not method of false conditionis :-" + k);
		System.out.println("The value of k using not method of true condition is:-" + (!(a > b)));

		// condition:- true..false
		System.out.println("-------condition:- true..false------");
		System.out.println("The value of l using not method false condition is :-" + l);
		System.out.println("The value of l using not method true condition:-" + (!(a != b)));

	}

	public static void static_method() {

		Logical_Operators r = new Logical_Operators();
		System.out.println("**STATIC METHOD**");

		// logical and
		System.out.println("*****logical and '&&'******");

		// condition:- true..true..true
		System.out.println("---------condition true..true..true------");
		System.out.println("the value of D using AND method with the condition of true..true..true:-- " + r.c);

		// condition:- true..false..false
		System.out.println("-------condition:- true..false..false-------");
		System.out.println("the value of E using AND method with the condition of true..false.false:-- " + r.d);

		// condition:- false..true..false
		System.out.println("-------condition:- false..true..false-------- ");
		System.out.println("the value of F using AND method with the condition of false..true..false:-- " + r.e);

		// condition:- false..false..false
		System.out.println("--------condition:- false..false..false------");
		System.out.println("the value of G using AND method with the condition of false..false..false:-- " + r.f);

		// logical or
		// condition:- true true..true
		System.out.println("******logical OR '||'*******");
		System.out.println("--------condition:- true true..true------");
		System.out.println("the value of g using or method with the condition of true..true..true:-- " + (r.g));

		// condition:- true false..true
		System.out.println("--------condition:- true false..true-------");
		System.out.println("the value of g using or method with the condition of true..false..true:-- " + (r.h)); // condition
																													// :-
																													// false
		// condition:- false true..true // true..true
		System.out.println("--------condition :- false true..true-------");
		System.out.println("the value of g using or method with the condition of false..true..true:-- " + (r.i));

		// condition:- false..false..false
		System.out.println("------condition:- false..false..false-------");
		System.out.println("the value of g using or method with the condition of false..false..false:----- " + (r.j));

		// LOGICAL NOT ! OPERATOR
		System.out.println("*****LOGICAL NOT! OPERATOR****");
		// condition:- false..true
		System.out.println("---------condition:- false..true--------");
		System.out.println("the value of k using not method condition of false is:" + r.k);

		// condition:- true..false
		System.out.println("------condition:-true...false------");
		System.out.println("the value of l using not method condition of true is:" + r.l);
	}

	public static void main(String[] args) {

		// creating object for instance method.
		Logical_Operators r = new Logical_Operators();
		// Declaration for instance method.
		r.instance_method();

		// declaration for static method.

		static_method();

	}

}
