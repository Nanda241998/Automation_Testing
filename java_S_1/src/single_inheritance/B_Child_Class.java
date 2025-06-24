package single_inheritance;

public class B_Child_Class extends A_Parent_Class{
	public void emails() {
		
		System.out.println("email composed");
	}
	
	public static void messages() {
		System.out.println("write messages ");
	}

	public static void main(String[] args) {
		B_Child_Class r=new B_Child_Class();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.f);
		r.Gmail();
		Whatsapp();
	}

}
