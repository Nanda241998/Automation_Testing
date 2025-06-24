package inheritance_oops;

public class Function_hasaArelationship {

	int b = 78;

	public void Instance_01() {
		System.out.println("child class");
	}
	// has a relationship
	// 1st property:- do not use extends keyword of parent class
    //2nd property:- create object of parent class to access parent class properties and behavior and in that we cannot access child class properties and behavior..
    
	public static void main(String[] args) {
		Parent_Class_Inheritance r = new Parent_Class_Inheritance();
		System.out.println(r.a);
		System.out.println(r.s);
		System.out.println(r.c);
		r.Instance();
		r.Static();
		
		

	}

}
