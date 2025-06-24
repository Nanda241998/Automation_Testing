package inheritance_oops;

public class Child_Class_Inheritance extends Parent_Class_Inheritance {
//is a relationship
	public static void main(String[] args) {
		Child_Class_Inheritance r = new Child_Class_Inheritance();
		System.out.println(r.a);
		System.out.println(r.s);
		r.Instance();
		Static();
	}

}
