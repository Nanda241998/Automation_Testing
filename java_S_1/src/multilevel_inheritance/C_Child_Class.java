package multilevel_inheritance;

public class C_Child_Class extends B_ParentChild_Class {
	
	public void  Database() {
		System.out.println("Database testing is done to test data from backend");
	}
	
	public static void selenium() {
		System.out.println("selenium tools used to make automated  script");
	}

	public static void main(String[] args) {
		C_Child_Class r=new C_Child_Class();
		System.out.println(r.a);
		System.out.println(r.f);
		System.out.println(r.s);
		r.Manual();
		Automation();
		r.Api();
		Mobile();
		r.Database();
		selenium();
		
		

	}

}
