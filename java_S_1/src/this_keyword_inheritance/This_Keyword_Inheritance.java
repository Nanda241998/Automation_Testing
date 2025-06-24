package this_keyword_inheritance;

public class This_Keyword_Inheritance extends Parent_Class_Inheritance {

	int d = 56;
	String w = "manual";

	public void Instance_03() {
		System.out.println(this.d);
		System.out.println(this.w);

		System.out.println("This keyword using instance");
	}

	public static void Static() {

		System.out.println("This keyword using static");

	}

	public This_Keyword_Inheritance() {
		System.out.println(this.a);
		System.out.println(this.s);
		this.Instance();
		this.Instance_03();
		this.Static();
		System.out.println("user defined constructor");
	}

	public static void main(String[] args) {
		This_Keyword_Inheritance r = new This_Keyword_Inheritance();

	}

}
