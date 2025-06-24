package nested_loops_types;

public class Floyds_Triangle {

	public static void main(String[] args) {
		//1
		//2   3
		//4   5  6
		//7   8  9 10
		//11 12 13 14 15
		//16 17 18 19 20 21
		//1 to 5---rows---outer loop
		//1 to 5 ----columns---inner loop
		int c=1;//1 2 3 4 5 
		for(int a=1;a<=6;a++) {//1 2 3 4 5
			for(int b=1;b<=a;b++) {//1  1 2 1 1 2 3
				System.out.print(c+"  ");
				c++;
			}
			System.out.println();
		}

	}

}
