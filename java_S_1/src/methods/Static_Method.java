package methods;

public class Static_Method {
	public static void Second_Method() {
		int t=56;
		int y=90;
		boolean b=(t>y);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// in static method no need to create object.
		
		Second_Method();

	}

}
