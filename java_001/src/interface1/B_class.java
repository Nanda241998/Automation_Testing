package interface1;

public class B_class implements  A_class,C_class{
	public void return01() {
		System.out.println("return01 method from instance class");
	}

	public static void main(String[] args) {
		B_class r= new B_class();
		r.java();
		
	
	}

	@Override
	public void java() {
		System.out.println("java ");
		
	}

	@Override
	public void api() {
	System.out.println("api");
		
	}

	@Override
	public void name() {
		System.out.println("name");
		
	}

	@Override
	public void type() {

System.out.println("type");
		
	}

	
}
