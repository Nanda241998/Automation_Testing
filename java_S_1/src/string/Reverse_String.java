package string;

public class Reverse_String {

	public static void main(String[] args) {
		String s="Automation";
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		for(int j=(s.length()-1); j>=0;j--) {
			System.out.println(s.charAt(j));
		}
		

	}

}
