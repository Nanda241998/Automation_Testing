package array;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		String a[] = new String[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");

		for (int i = 0; i <5; i++) {
		
			System.out.println(i);
			a[i]=sc.nextLine();
		
		}
		System.out.println(Arrays.toString(a));

	}

}
