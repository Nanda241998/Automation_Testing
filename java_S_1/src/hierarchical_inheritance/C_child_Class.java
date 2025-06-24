package hierarchical_inheritance;

public class C_child_Class extends A_Class_Parent{
	
	public void smoke() {
		System.out.println("smoke testing done when build is received for the first time from developer");
		
	}
	public static void sanity() {
		System.out.println("sanity tetsing done when build is sent to us after multiple releases has been done");
	}

	public static void main(String[] args) {
		C_child_Class r= new C_child_Class();
		r.functional();
		nonfunctional();
		r.smoke();
		sanity();
	}

}
