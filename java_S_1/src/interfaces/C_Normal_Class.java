package interfaces;

public class C_Normal_Class implements A_Class,B_Class,D_Class,E_Class{

	public static void main(String[] args) {
		C_Normal_Class r= new C_Normal_Class();
		r.Login();
		r.logout();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.s);
		r.child();
		r.child_abs();
		r.Name_01();
		r.Name_Abs();

		
		
		//to access static method we can use class name with method name.
		A_Class.Username();
		E_Class.Name_Sta();
		D_Class.child_sta();
		

	}

	@Override
	public void Login() {
		System.out.println("login method from a-class");
		
	}

	@Override
	public void logout() {
		System.out.println("logout method from a_class");
		
	}

	@Override
	public void Name_01() {
		System.out.println("name_01 method comes from e class");
		
	}

	@Override
	public void Name_Abs() {
	System.out.println("method come from the e_class");
		
	}

	@Override
	public void child() {
		System.out.println("child method comes form the d class");
		
	}

	@Override
	public void child_abs() {
		System.out.println("child_abs method comes from d-class");
	}

}
