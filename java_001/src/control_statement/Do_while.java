package control_statement;

public class Do_while {

	public static void main(String[] args) {
		int a = 1;
		do {
			System.out.println(a);
			if (a == 5) {
				break;
			}
			a++;
		} while (a <= 10);
		
		int b=10;
		do {
			System.out.println(b);
			if(b==5) {
				break;
			}
			b--;
		}while(b>=1);
		
		int c=1;
		do {
			c++;
			if(c==5) {
				continue;
			}
			System.out.println(c);
		}while(c<=10);

	}

}
