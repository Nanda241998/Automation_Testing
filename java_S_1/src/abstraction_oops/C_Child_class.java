package abstraction_oops;

public class C_Child_class extends A_class{
	public C_Child_class() {
		
		super(23,45);
		super.failed();
		System.out.println("parametrized constructor from child class");
	}

	public static void main(String[] args) {
		C_Child_class r=new C_Child_class();
		r.Login();
		r.failed();
		Menu();
		

	}

	@Override
	public void Login() {
		this.passed();
		this.logout();
		this.Credentials();
		System.out.println("login succesfull");
		
	}

	@Override
	public void Credentials() {
		System.out.println("credentials are valid");
		
	}

	@Override
	public void logout() {
		System.out.println("logout successfull");
		
	}

}
