package type_casting;

public class Narrowing_type_casting {

	public static void main(String[] args) {
		//narrowing type casting is to convert bigger data type to smaller data type.
		
		int a=90;
		byte b=(byte) a;
		System.out.println(b);
		
		double d=20.4;
		float f=(float) d;
		System.out.println(f);
		
		float o=30.4f;
		short s=(short) o;
		System.out.println(s);
		
	}

}
