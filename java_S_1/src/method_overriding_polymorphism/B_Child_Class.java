package method_overriding_polymorphism;

public class B_Child_Class extends A_Parent_Class {
	public static void Boi() {
		
		System.out.println("Hdfc bank form child class");
	}

	public void Sbi() {
		
		System.out.println("Icici bank from child class");
	}

	public void Bom() {

		System.out.println("Idbi bank from child class");

	}

	public static void main(String[] args) {
		B_Child_Class r = new B_Child_Class();
		r.Sbi();
		Boi();
		r.Bom();

		System.out.println("---using third property----");
		// 3rd property create ref_var of parent class and refer or hold the child class
		// object
		
		  A_Parent_Class t=new B_Child_Class(); 
		  t.Bom(); 
		  t.Sbi(); 
		  Boi();
		 

		System.out.println("----using 2nd property ---");

		// 2nd property to create an object of parent class
		A_Parent_Class r1 = new A_Parent_Class();
		r1.Bom();
		r1.Sbi();
		r1.Boi();

	}

}
