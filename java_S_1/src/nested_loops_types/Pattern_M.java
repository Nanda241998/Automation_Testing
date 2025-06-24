package nested_loops_types;

public class Pattern_M {

	public static void main(String[] args) {
		//      *
		//    * * *
		//  * * * * *
		//rows..1 to 3..outer loop
		//columns.. 1 to 5 inner loop
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=5-a;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=5;c++) {
			System.out.print("* ");
		}
			System.out.println();
	}

}
}
