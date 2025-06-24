package string;

public class String_By_literal_way {
	//String s="Automation process use to test web application with the automated tools";

	public static void main(String[] args) {
		//using By literal way we can store the value with the same objects and it store in scp area of heap memory.
		//in by literal way values stored in same objects if existing object is already created the scp area will not created another object.
		
		System.out.println("-----BY_LITERAL_WAY------");
		String u="Automation process";
		String r1="Automation process";
		System.out.println("Storage of String a1 and r1 is:"+(u=r1));
		

	}

}
