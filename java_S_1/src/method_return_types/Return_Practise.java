package method_return_types;

public class Return_Practise {

	// using assignment operator with return types.
	int a = 90;
	int b = 23;

	long c = a + b;
	long d = a - b;
	long e = a * b;
	long f = a / b;
	long g = a % b;

	// instance method
	//without return statement and no parameters.
	public void Assignment() {
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

	public void Assignment01(int h, int i) {
		// h=23,i=20
		System.out.println(h > i || i < h);// true..true..true
		System.out.println(h != i || h >= i);// true..false..true
		System.out.println(i >= h || h >= i);// false..true..true
		System.out.println(i == h || h == i);// false..false..false
	}

	public static void Assignment02(int j, float k) {
		System.out.println(j >= k && k <= j); // true..true..true
		System.out.println(j != k && j == k);// true..false..false
		System.out.println(k == j && k <= j);// false..true..false
		System.out.println(j <= k && k >= j);// false..false..false
		return;
	}

	public void Assignment03(int o, long w) {
		System.out.println("not: " + !(o > w));// true..false
		System.out.println("not: " + !(o == w));// false..true
	}

	public long Assignment04(int q, long p) {
		return q % p;

	}

	public String Assignment05(String s) {
		return "Nanda";

	}

	public static char Assignment06(char m) {
		return 'k';
	}

	public int Assignment07(int x, int v) {
		// System.out.println(x=v+6);
		return x = v * 6;
	}

	public static void main(String[] args) {
		Return_Practise r = new Return_Practise();
		r.Assignment();
		r.Assignment01(23, 20);
		Assignment02(44, 30.45f);
		r.Assignment03(90, 70);
		System.out.println(r.Assignment04(66, 780));
		System.out.println(r.Assignment05("mahjaan"));
		System.out.println(Assignment06('l'));
		System.out.println(r.Assignment07(23, 20));

	}

}
