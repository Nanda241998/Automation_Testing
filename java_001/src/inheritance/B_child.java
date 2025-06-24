package inheritance;

public class B_child extends A_parent {

	public static void login() {
		System.out.println("login method from b class");
	}

	public static void main(String[] args) {
		B_child r = new B_child();
		r.functional();
		Return();
		r.Type();
		login();
	}

}
