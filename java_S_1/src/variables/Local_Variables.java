package variables;

public class Local_Variables {
	
	//LOcal variables declared inside class and inside the method.
	
	//method of instance method.
	public void Instance_Method() {
		int a=90;
		System.out.println(a);
		
	}
	
	//method of static method.
	public static void Static_Method() {
		int b=45;
		System.out.println(b);
	}

	public static void main(String[] args) {
		Local_Variables r = new Local_Variables();
		r.Instance_Method();  //output for instance.
		Static_Method();     //output for static.

	}

}
