package constructor;

public class Parameterized_Constructor {
	
	
	public Parameterized_Constructor(int a,float f,String s) {
		
		//parameterized constructor can used and can call parameters
		System.out.println(a);
		System.out.println(f);
		System.out.println(s);
		System.out.println("parameterized constructor");
	}

	public static void main(String[] args) {
		Parameterized_Constructor p= new Parameterized_Constructor(12,32.4f,"java");

	}

}
