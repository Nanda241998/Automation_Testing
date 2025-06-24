package nested_loops_types;

public class Roatate_by_180 {

	public static void main(String[] args) {
		//          *
		//        * *
		//      * * *
		//    * * * * 
		//  * * * * *
		//* * * * * *
		//1 to 6 rows_outeer loop
		//1 to 6 columns_inner loop
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=6-a;b++) {
				System.out.print("  ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//using numbers
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=6-a;b++) {
				System.out.print("  ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
	}

}
