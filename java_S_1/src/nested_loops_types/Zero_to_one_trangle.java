	package nested_loops_types;
	
	public class Zero_to_one_trangle {
	
		public static void main(String[] args) {
			//1
			//0 1
			//1 0 1
			//0 1 0 1
			//1 0 1 0 1
			//0 1 0 1 0 1
			//1 to 6 rows----outer loop
			//1 to 6 columns for inner loop
			for(int a=1;a<=6;a++) {// 1 2 3 4 5
				for(int b=1;b<=a;b++) {//1 1 1 2 3 1 2 3 4 1
					if((a+b)%2==0) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}
				}
				System.out.println();
			}
		}
	
	}
