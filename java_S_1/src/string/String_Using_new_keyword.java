package string;

public class String_Using_new_keyword {

	public static void main(String[] args) {
		// using new keyword of string allocation is stored in two area with the
		// creating of diff diff objects.

		String s = new String("Test Enginner");
		String s1 = new String("Test Engineer");
		
		String s2 = new String("Quality Analyst");
		//heap area memory allocation
		System.out.println("----Heap area memory Allocation----");

		System.out.println("storage of s using new keyword:"+s);
		
		System.out.println("storage of s1 using new keyword is:"+s1);
		
		System.out.println("Storage of s2 using new keyword is:"+s2); 
		
		//scp area memory allocation
		System.out.println("----SCP memory allocation----");
		System.out.println("storage of s & s1 using new keyword is:"+(s=s1));
		
		System.out.println("storage of s2 using new keyword is:"+s2);
		
		

	}

}
