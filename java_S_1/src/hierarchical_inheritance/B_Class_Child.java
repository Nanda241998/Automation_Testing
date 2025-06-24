package hierarchical_inheritance;

public class B_Class_Child extends A_Class_Parent {
	
	public void usability() {
		System.out.println("usability testing is done to verify ui part functionality");
	}
	
	public static void performance() {
		System.out.println("performance tetsing is done to verify load and stress testing");
	}

	public static void main(String[] args) {
		B_Class_Child e= new B_Class_Child();
		e.functional();
		nonfunctional();
		e.usability();
		performance();

	}

}
