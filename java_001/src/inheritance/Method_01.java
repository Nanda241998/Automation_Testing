package inheritance;

public class Method_01 extends  Method_overriding {
	
	public static void api() {
		System.out.println("api testing from method01");
	}
	public void mobile() {
		System.out.println("mobile testing from method01");
	}
	public static void database() {
		System.out.println("database testing from method01");
	}
	

	public static void main(String[] args) {
		Method_01 e= new Method_01();
		e.api();
		e.mobile();
		e.database();
		
		Method_overriding w= new Method_01();
		w.api();
		w.mobile();
		w.database();

		Method_overriding p= new Method_overriding();
		p.mobile();
		p.api();
		w.database();
	}

}
