package wrapper_class;

public class Wrapper_to_primitive {

	public static void main(String[] args) {

		Integer i = new Integer(34);

		int a = i.intValue();

		System.out.println(a);

		System.out.println("--------float ----------");

		Float f = new Float(23.4f);

		float g = f.floatValue();

		System.out.println(g);

		System.out.println("------double------");

		Double d = new Double(23.4f);

		double e = d.doubleValue();

		System.out.println(e);

		System.out.println("------long--------");

		Long l = new Long(340);

		long o = l.longValue();

		System.out.println(o);

		System.out.println("----byte--------");

		Byte b = new Byte((byte) 23);

		byte k = b.byteValue();

		System.out.println(k);
		System.out.println("-----short----------");

		Short s = new Short((short) 56);
		
		short p=s.shortValue();
		
		System.out.println(p);
		
		System.out.println("-------char-------");
		
		Character ch= new Character('r');
		
		char j= ch.charValue();
		
		System.out.println(j);

	}

}
