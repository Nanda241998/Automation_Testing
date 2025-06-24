package mock_package;

public class Method_Overloading {

	public void name() {
		this.name(34.5f);
		this.name(23, 40);
		this.name("java");
		this.name(56);
		System.out.println("first method is name");
	}

	public void name(int a) {

		System.out.println("second method with the help of parametere");
	}

	public void name(int a, int b) {
		System.out.println("third method with the help of two data type");
	}

	public void name(float f) {

		System.out.println("fourth method is float");
	}

	public void name(String s) {
		System.out.println("string method ");
	}

	public static void main(String[] args) {
		Method_Overloading r = new Method_Overloading();
		r.name();

	}

}
