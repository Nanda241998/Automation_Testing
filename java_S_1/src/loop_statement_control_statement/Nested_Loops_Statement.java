package loop_statement_control_statement;

public class Nested_Loops_Statement {

	public static void main(String[] args) {
		/*//nested loop statement consist of inside loop and another loop.
		//outer loop 1 to 20
		//inner loop 1 to 15
		for(int a=1; a<=5; a++) {
			System.out.print("The value of a is:"+a);
			System.out.println(" ");
			
			for(int b=1; b<=5;b++) {
				System.out.print(b);
			}
			System.out.println();
			//System.out.print("----");
		}*/
		
		//
		for(int i=0;i<10;i++) {
	if(i%2==0)
			System.out.println(i);
			
			{
				System.out.println("--------------");
				for(int j=1;j<10;j++)
				{
					System.out.println(j);
				}
					
			}
		}
		

		}
	}


