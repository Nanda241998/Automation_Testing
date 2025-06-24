package multilevel_inheritance;

public class B_ParentChild_Class extends A_Parent_Class {

	public void Api() {
		System.out.println("Api testing done to sending request getting response");
	}

	public static void Mobile() {
		System.out.println("Mobile testing done to check mobile application");
	}

	public static void main(String[] args) {
		B_ParentChild_Class r = new B_ParentChild_Class();
		System.out.println(r.a);
		System.out.println(r.f);
		System.out.println(r.s);
		r.Manual();
		r.Api();
		Mobile();

		Automation();
	}

}
