package concatenation;

public class String_Concatenation {

	// using with primitive data types.

	int d = 98;
	byte s = 65;
	int c = d + s;
	boolean e = (s < d);

	// using with non-primitive data types.
	String f = "nanda ";
	String a = "mahajan";
	String w = (f + a);

	public static void main(String[] args) {
		// creating object to accessing variables to join two requirements using concat method.
		String_Concatenation r = new String_Concatenation();
		//trying different methods for output using concate.
		System.out.println("the value of integer int and byte is:" + r.d + r.s);
		System.out.println("the value of integer int and byte is:" + r.e);// boolean data type
		System.out.println("the value of integer int and byte is:" + r.c);
		System.out.println("the name of the student of stp infotech is:" + r.f + " " + r.a);
		System.out.println("the name of the student of stp infotech is:" + r.w);

	}

}
