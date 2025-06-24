package array_Topics;

import java.util.Arrays;

public class Array_To_Sort {

	public static void main(String[] args) {
		System.out.println("Before sorting..........");
		int a[] = { 10, 34, 55, 66, 43, 21, 54 };
		System.out.println(Arrays.toString(a));
		System.out.println("After sorting..........");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("-------------------------");
		System.out.println("before sorting...");
		int b[] = { 23, 45, 66, 78, 443, 2345 };
		System.out.println(Arrays.toString(b));
		System.out.println("After sorting...");
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		System.out.println("---------------------------");
		System.out.println("before sorting....");
		String c[] = { "java", "anum", "private", "public" };
		System.out.println(Arrays.toString(c));
		System.out.println("after sorting.........");
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		System.out.println("--------------------");
		System.out.println("Before sorting......");
		float d[]= {12.4f,45.6f,34.5f,56.5f};
		System.out.println(Arrays.toString(d));
		System.out.println("After sorting........");
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
	}

}
