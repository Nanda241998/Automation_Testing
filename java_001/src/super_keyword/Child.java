package super_keyword;

public class Child extends Parent {

	public void login() {
		super.login();
		super.logout();

		System.out.println("login from child");
	}

	public static void logout() {
		System.out.println("logout from child");
	}

	public Child(int e,int o) {
	super(34,56);
		System.out.println("parameterized constrcutor from child");
	}

	public static void main(String[] args) {
		Child c = new Child(24,67);
		c.login();
		c.logout();

	}

}
