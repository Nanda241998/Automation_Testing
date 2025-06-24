package loop_statement_control_statement;

public class Do_While_Loop_Statement {

	public static void main(String[] args) {
		// for 1 to 10 numbers
		/*
		 * int a=1; do { System.out.println(a); a++; }while(a<=10);
		 * System.out.println("----------");
		 * 
		 * //Approach 1:- for even number int b=0; do {
		 * System.out.println("even number: "+ b); b+=2;
		 * 
		 * }while(b<=10); System.out.println("----------");
		 * 
		 * //Approach 2:- for even number int c=0; do {
		 * System.out.println("even number: "+c*2); c++; }while(c<=10);
		 * 
		 * //Approach 3:-- for even number int d=1; do { if(d%2==0){
		 * System.out.println("even number: "+d); d++; }
		 * 
		 * }while(d<=20);
		 */
		System.out.println("------------");
		// reverse number
		int e = 20;
		do {
			System.out.print(e + " ");
			e--;
		} while (e >= 1);
		System.out.println();
		System.out.println("------------------------");
		// reverse odd number
		int f = 19;
		do {
			System.out.print(f * 2 + 1 + " ");
			f--;

		} while (f >= 0);
		System.out.println();
		System.out.println("------------------------");
		int g=1;
		do {
			System.out.println(g);
			g+=2;
			
		}while(g<=20);
		
		System.out.println();
		System.out.println("------------------------");
		int i=1;
		do {
			if(i%2!=0) {
			System.out.println(i);
		}
			i++;
		}while(i<=20);
		System.out.println();
		System.out.println("------------------------");
		int j=5;
		do {
			System.out.println("Do while statment");
			j++;
		}while(j>=5);

	}

}
