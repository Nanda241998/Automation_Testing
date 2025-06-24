package abstraction;

public class B_child extends A_parent {

	public static void main(String[] args) {
		B_child r= new B_child();
		r.automation();
		r.manual();
		r.selenium();
		r.testing();
		r.developing();

	}

	@Override
	public void manual() {
		System.out.println("manual testing is an completeness, correcctness and quality");
		
	}

	@Override
	public void automation() {
	System.out.println("automation testing is done to test high quality software using automated tools");
		
	}

	@Override
	public void selenium() {
		System.out.println("selenium is third party tool");
	}

}
