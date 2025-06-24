package array_Single_dimensional;

public class Array_Single_D_with_Allocation {

	public static void main(String[] args) {
		int r[] = new int[5];
		r[0] = 10;
		r[1] = 20;
		r[2] = 30;
		r[3] = 40;
		r[4] = 50;
		// for each
		for (int i : r) {
			System.out.println("The value of array is: " + i);
		}
		System.out.println("length of r is:" + r.length);
		System.out.println("index of r :" + r[4]);
		System.out.println("-----single dimensional array using for loop----");
		// for loop
		for (int j = 0; j < r.length; j++) {
			System.out.println("The value of array is:" + r[j]);
		}

	}

}
