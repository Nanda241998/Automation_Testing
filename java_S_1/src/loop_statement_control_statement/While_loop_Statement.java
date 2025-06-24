package loop_statement_control_statement;

public class While_loop_Statement {

	public static void main(String[] args) {
		// for 1 to 10 numbers\
		System.out.println("----1 to 10 numbers-----");
		int a = 1;
		while (a <= 10) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println();
		System.out.println("-----10 to 1 number------");
 
		// for 10 to 1 numbers
		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}

		// printing while loop statement
		System.out.println("-----while loop----");
		int c = 1;
		while (c <= 10) {
			System.out.println("While_loop");
			c++;
		}
		// approach 1: even number 1 to 10
		System.out.println("------even number 1 to 10----");
		int d = 0;
		while (d <= 10) {
			if (d % 2 == 0) {
				System.out.print(d + " ");
			}
			d++;
		}
		System.out.println();
		System.out.println("------ approach 2: even number and table of 2---------");
		// approach 2: even number and table of 2
		int e = 0;
		while (e <= 10) {
			System.out.print(e * 2 + " ");
			e++;
		}
		System.out.println();
		System.out.println("-----approach 3:even number-------");
		// approach 3:even number
		int f = 0;
		while (f <= 10) {
			System.out.print(f + " ");
			f += 2;
		}
		System.out.println();
		System.out.println("---------------");
		// using decrement operator
		int g = 21;
		while (g >= 1) {
			System.out.println(g);
			g--;
		}
		System.out.println();
		System.out.println("------ even number from 20 to 1---------");
		// printing even number from 20 to 1
		int h = 20;
		while (h >= 1) {
			System.out.println(h);
			h -= 2;
		}
		
		System.out.println();
		System.out.println("-------table of 2 and even number--------");
		// table of 2 and even number
		int i = 20;
		while (i >= 1) {
			System.out.println(i * 2);
			i--;
		}
		
		System.out.println();
		System.out.println("-------table of 2 and even number--------");
		//even using if condition
		int j=20;
		while(j>=1) {
			if(j%2==0) {
				System.out.println(j);
			}
			j--;
		}
		System.out.println();
		System.out.println("-------odd number--------");
		//odd number 1 to 20
		int k=0;
		while(k<=19) {
			System.out.print(k*2+1+" ");
			k++;
		}
		
		System.out.println();
		System.out.println("-------odd number--------");
		//odd number
		int l=1;
		while(l<=20) {
			if(l%2!=0) {
				System.out.print(l+" ");
			}
			l++;
		}
		System.out.println();
		System.out.println("-------odd number--------");
		//table 3 number
		int m=1;
		while(m<=20) {
			System.out.println("m*"+m+"="+(m*3));
			m++;
		}
		
		

	}

}
