package mock_package;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//1
		//0 1
		//1 0 1
		//0 1 0 1
		//1 0 1 0 1
		//0 1 0 1 0 1
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}