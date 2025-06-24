package array_multidimensional;

public class MultiD_with_allocation {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		// rows:- 2...starts from 0, 1 --outer loop
		// columns:-3....starts from 0,1 ,2 ----inner loop

		// for row 1
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 60;
		a[0][4] = 70;

		// for row 2
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		a[1][3] = 80;
		a[1][4] = 90;

		// for row 3
		a[2][0] = 12;
		a[2][1] = 22;
		a[2][2] = 33;
		a[2][3] = 44;
		a[2][4] = 55;

		// for row 4
		a[3][0] = 90;
		a[3][1] = 88;
		a[3][2] = 77;
		a[3][3] = 78;
		a[3][4] = 66;

		// for row 5
		a[4][0] = 45;
		a[4][1] = 24;
		a[4][2] = 35;
		a[4][3] = 36;
		a[4][4] = 67;

		// nested for loop
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("length of array is :"+a.length);
		System.out.println("index of 1 by 2 is:"+ a[1][2]);
		System.out.println("index of 2 by 4 is:"+a[4][4]);
	

	}

}
