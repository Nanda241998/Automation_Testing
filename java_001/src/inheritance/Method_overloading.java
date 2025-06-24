package inheritance;

public class Method_overloading {
	public void login() {
		System.out.println("login method no parameters");
	}
	
	public void login(int a) {
		System.out.println("login method with single parameters");
	}
	
	public void login(int a, int b) {
		System.out.println("login method from two parameters");
	}
	
	public void login(int a, String d) {
		System.out.println("login method from int and string parameters");
	}
	public void login(float f ) {
		System.out.println("login method from flaot parameters");
	}

	public static void main(String[] args) {
		Method_overloading r= new Method_overloading();
		r.login();
		r.login(23.3f);
		r.login(12);
		r.login(33,"java");
		r.login(44, 50);
		
	
	}

}
