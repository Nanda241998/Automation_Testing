package operators;

public class Test_Assignment {
	static int a=78;
	static int b=66;
	
	static long p=a+b;
	public void Instance_Method() {
		System.out.println(p++);//
		/*System.out.println(--p);//
		System.out.println(p++);//
		System.out.println(--p);//
		System.out.println(p--);//*/
	}
	
	public static void static_method() {
		//Test_Assignment r= new Test_Assignment();
		//System.out.println(p++);
		
	}
	

	public static void main(String[] args) {
		Test_Assignment r= new Test_Assignment();
		r.Instance_Method();
		static_method();
		
	}

}
