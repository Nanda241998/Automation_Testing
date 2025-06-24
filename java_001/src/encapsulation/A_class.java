package encapsulation;

public class A_class {
	
	private int pincode=332401;
	private void a_class(int a) {
		pincode=a;
		System.out.println(pincode);
	}

	public static void main(String[] args) {
		A_class q= new A_class();
		q.a_class(233333);
		
	}

}
