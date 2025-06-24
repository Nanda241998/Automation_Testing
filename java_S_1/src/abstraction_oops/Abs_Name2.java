package abstraction_oops;

public class Abs_Name2 extends Abs_Name {
	int a = 90;

	public void Instance() {
		System.out.println(this.a);
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		Abs_Name2 r = new Abs_Name2();

		r.Username();
		r.Statement();
		summary();
		r.Instance();

	}

	@Override
	public void Username() {
		this.accountDetails();
		this.Passsword();
		System.out.println("enter your username");

	}

	@Override
	public void Passsword() {
		System.out.println("enter 8 digit password");

	}

	@Override
	public void accountDetails() {

		System.out.println("enter account credentials");
	}

}
