package conditional_statement_controls_statements;

public class Nested_if_Statement {
	public class Nested_if {

		public static void main(String[] args) {
			int temperature=55;
			
			if(temperature>40) {
				        System.out.println("Pune temperature is more than 40 degree celcius");
			         
			                if(temperature>35) {
			         	          System.out.println("Nagpur temperature is more than 35 degree celcius");
			          
			                         if(temperature<45) {
				                             System.out.println("Wardha temperature is less than 45");
			          
			                                   if(temperature>45) {
				                                          System.out.println("Chandrapur temperature is more than 45 degree celcius");
			                                   }
			                         }
			                         
			                }
			}
			else {
				System.out.println("All of the above written city's temperature is not equal.");
			}
		}
	}
	
}
			                                   
		