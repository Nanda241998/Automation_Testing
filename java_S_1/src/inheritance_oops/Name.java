package inheritance_oops;

public class Name extends Parent_Class_Inheritance {
	// 3rd property:-- we can use parent class ref var to hold or ref child class
	// object. for that we have to use extend keyword of parent class.
     //we cannot access child class properties and behavior.
	int c = 34;
	String e = "automation";

	public void Instance_02() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		Parent_Class_Inheritance t = new Name();
		System.out.println(t.a);
		System.out.println(t.s);
		t.Instance();
		Static();
		
		//4th property
		//Name r= new  Parent_Class_Inheritance();

	}

}
