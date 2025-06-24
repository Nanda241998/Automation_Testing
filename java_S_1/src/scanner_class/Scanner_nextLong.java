	package scanner_class;
	
	import java.util.Scanner;
	
	public class Scanner_nextLong {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first number:");
			long a = sc.nextLong();
			System.out.println("Enter second number:");
			long b=sc.nextLong();
			
			long c=a+b;
			long d=a-b;
			long e=a*b;
			long f=a/b;
			long g=a%b;
			System.out.println("The value of a and b is:"+c);
			System.out.println("The value of a and b is:"+d);
			System.out.println("The value of a and b is:"+e);
			System.out.println("The value of a and b is:"+f);
			System.out.println("The value of a and b is:"+g);
		}
	
	}
