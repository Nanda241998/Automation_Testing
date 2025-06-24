package array_Topics;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_class_Array {

	public static void main(String[] args) {
		/*int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Values:"+i);
			a[i] = sc.nextInt();

		}
		System.out.println("Printing an array as:"+Arrays.toString(a));
	
	*/
		/*
	int []b=new int [7];
	Scanner sc1= new Scanner(System.in);
	for(int i=0;i<7;i++) {
		System.out.println("Enter values:"+i);
		b[i]=sc1.nextInt();
		
	}
	System.out.println("Printing an array is:"+Arrays.toString(b));*/
	
	String s[]=new String[5];
	Scanner sc2=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		System.out.println("Enter string:"+i);
		s[i]=sc2.nextLine();
	}
	System.out.println("Printing an array is:"+Arrays.toString(s));
	
	}
}
