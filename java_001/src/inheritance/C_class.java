package inheritance;

public class C_class extends B_child{
	
	public void instance() {
		System.out.println("instance method from child class");
	}
	
	public static void main(String[] args) {
		C_class r= new C_class();
		r.login();
		r.functional();
		r.Type();
		r.Return();
		r.instance();
	}
	

}
