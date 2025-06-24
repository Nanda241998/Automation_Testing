package method_return_types;

public class Practise2 {
	// without return statement and no parameters.
	public void P_01() {
		int a = 98;
		int b = 23;
		// comparison operators.
		boolean c = a <= b;
		boolean d = a >= b;
		boolean e = a == b;
		boolean f = a != b;
		boolean g = a < b;
		boolean h = a > b;

		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

	// without return statement and using parameters.
	public void P_02(int d, int f) {
		// assignment operators.
		System.out.println(d = f + 3);
	}

	// with return statement and with parameters.
	public void P_03(int i, long j) {
		// logical and operators.int i=45, long j=60.
		System.out.println(i < j && j > i);// true..true..true
		System.out.println(i <= j && i == j);// true.false..false
		System.out.println(j <= i && i != j);// false..true..false
		System.out.println(i == j && i >= j);// false..falsee.false
		return;

	}

	// with return types and having parameters.
	public boolean P_04(int q, double n) {
		// logical or operator.int q=45, double n=40.
		// System.out.println();//true..truee.true
		return q >= n || n <= q; // true..true..truee
	}

	public static boolean P_05(int m, long l) {
		return m >= l || l == m; // true..false..true
	}
	public boolean P_06(int b, int u) {
		return b<=u||b!=u;
	}
	public static boolean P_07(long o, double u) {
		return o==u||u==o ;//false..false..false
	}
public static boolean P_08(int u,int h) {
	return !(u<=h); 
}

public boolean P_09(int l, int y) {
	return !(l!=y);
}
	public static void main(String[] args) {
		Practise2 r = new Practise2();
		r.P_01();

		r.P_02(12, 20);

		r.P_03(45, 60);

		System.out.println(r.P_04(45, 40));

		System.out.println(P_05(45, 40));
		
		System.out.println(r.P_06(45,40));
		 
		System.out.println(P_07(45, 40));
		
		System.out.println(P_08(34,22));
		
		System.out.println(r.P_09(11,23));

	}

}
