package array_Single_dimensional;

public class Array_Float_with_Allocation {

	public static void main(String[] args) {
		float f[] = new float[5];
		f[0] = 10.3f;
		f[1] = 12.3f;
		f[2] = 13.4f;
		f[3] = 14.3f;
		f[4] = 15.3f;

		for (float i : f) {
			System.out.println(i);
		}
		System.out.println("length of f is:" + f.length);
		System.out.println("index of 4 is:" + f[4]);
		System.out.println("------using for loop----");
		for (int j = 0; j < 5; j++) {
			System.out.println(f[j]);
		}

	}

}
