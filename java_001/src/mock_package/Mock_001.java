package mock_package;

public class Mock_001 {
	int a;
	int b;

	boolean d = a <= b;
	boolean e = b >= a;
	boolean f = a == b;
	boolean g = a != b;

	// int c=a+b;
	/*
	 * long d=a*b; long e=a-b; int f= a/b; int g= a%b;
	 */

	public void Im(int h, int i) {
		a = h;
		b = i;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	public static void Sm(int j, int c) {
		Mock_001 r = new Mock_001();

		System.out.println(r.a = j);
		System.out.println(r.b = c);
		System.out.println(r.d);
		System.out.println(r.e);
		System.out.println(r.f);
		System.out.println(r.g);

	}

	public void Im_01(int w, int k) {
		System.out.println(w < k && k > w);// true
		System.out.println(w != k && w >= k);// false
		System.out.println(w == k && k > w);
		System.out.println(k == w && w >= k);

	}

	public static void Sm_01(int u, int o) {
		// Mock_001 r =new Mock_001();
		System.out.println(u >= o || o <= u);
		System.out.println(u > o || o == u);
		System.out.println(u == o || u != o);
		System.out.println(o == u || o >= u);

	}

	public void Im_02(int p, int q) {
		System.out.println(!(p != q));
		System.out.println(!(p == q));
	}

	public void Im_03(int g, int j) {
		System.out.println(g + j);
		return;

	}
	public static int Sm_03(int l, int n) {
		return l+n;
		
	}
	public static boolean Sm_04(int o, int p) {
		return o<p||p>o;
	}
	public void main() {
		System.out.println(g);
		return;
	}
	public static void main_1(int w, int t) {
		System.out.println(w=w+t);
		return;
	}
	public int main_02(int i, int m) {
		//System.out.println();
		return i*m;
	}

	public static void main(String[] args) {
		Mock_001 r = new Mock_001();
		r.Im(24, 6);
		Sm(34, 56);
		r.Im_01(45, 70);
		Sm_01(56, 22);
		r.Im_02(88, 98);
		r.Im_03(66, 70);
		System.out.println(Sm_03(34,78));
		System.out.println(Sm_04(56,67));
		r.main();
		main_1(34,56);
		System.out.println(r.main_02(34,56));
	}

}