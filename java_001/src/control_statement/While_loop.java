package control_statement;

public class While_loop {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			if (a == 5) {
				break;
			}
			a++;

		}
		
		int b=10;
		while(b>=1) {
			System.out.println(b);
			if(b==5) {
				break;
			}
			b--;
		}
		
		int c=1;
		
		while(c<=10) {
			c++;
			if(c==5) {
				continue;
			}
			System.out.println(c);
		}

	}

}
