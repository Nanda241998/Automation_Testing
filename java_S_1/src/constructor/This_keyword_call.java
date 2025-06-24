package constructor;

public class This_keyword_call {
	public This_keyword_call(int a) {
		this(23, 43);
		System.out.println("using int:" + a);

	}

	public This_keyword_call(int b, int c) {
		System.out.println("using two datatypes");
		System.out.println(b);
		System.out.println(c);

	}

	public This_keyword_call(float f) {
		this(34);
		System.out.println("using float:" + f);
	}

	public This_keyword_call(String s) {
		this(34.4f);
		System.out.println(s);
	}

	public static void main(String[] args) {
		This_keyword_call r = new This_keyword_call("java");

	}

}
