package wrapper_class;

public class Primitive_to_wrapper {

	public static void main(String[] args) {
		int a=1;
		
		Integer s=Integer.valueOf(a);
		
		System.out.println(s);
		
		System.out.println("------float object-------");
		
		float f=23.3f;
		
		Float c=Float.valueOf(f);
		
		System.out.println(c);
		
		System.out.println("-------Double----------");
		
		double d= 12.3f;
		
		Double w= Double.valueOf(d);
		
		System.out.println(w);
		
		System.out.println("--------Byte-----");
		
		byte b= 19;
		
		Byte n= Byte.valueOf(b);
		
		System.out.println(n);
		
		System.out.println("------short--------");
		
		short m= 40;
		
		Short l= Short.valueOf(m);
		
		System.out.println(l);
		
		System.out.println("-------long----------");
		
		long h= 300;
		
		Long a1=Long.valueOf(h);
		
		System.out.println(a1);
		
		System.out.println("------char------");
		
		char c1='o';
		
		Character c2= Character.valueOf(c1);
		
		System.out.println(c2);
		

	}

}
