package super_keyword_inheritance;

public class Super_keyword_in_inheritance extends Parent_Class_Inheritance {
	
	public void Name1() {
		super.Name1();
		System.out.println(this.a);
		System.out.println(this.b);
		Test();
		Test1();
		System.out.println("name 1 from parent class");
	}
	
	public static void Test1() {
		
		System.out.println("test1 from child class");
	}
	
	public Super_keyword_in_inheritance() {
		
		super(32,45);
		System.out.println("parameterized constructor from parent class");
	}

	public static void main(String[] args) {
		Super_keyword_in_inheritance r = new Super_keyword_in_inheritance();
		r.Name1();

	}

}
