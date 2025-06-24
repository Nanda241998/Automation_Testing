package variables;

public class Static_Variables {
	
	//static variables is declared inside the class and outside the method
	//int y=90;
	static int y=34;
	
	//method  for instance method.
	public void Instance_Method() {

		System.out.println(y);
		
	}
	
	//method for static method.
	public static void Static_Method() {
		//Static_Variables g = new Static_Variables();
		System.out.println(y);
		
	}   

	public static void main(String[] args) {
		
		//creating object to access the instance method.
		Static_Variables g = new Static_Variables();
		g.Instance_Method();   //output of instance method.
		Static_Method();       //output of static method.

	}

}
