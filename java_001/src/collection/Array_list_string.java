package collection;

import java.util.ArrayList;

public class Array_list_string {

	public static void main(String[] args) {
		ArrayList<String> weekname=new ArrayList<String>();
		
		weekname.add("saturday");
		weekname.add("sunday");
		weekname.add("monday");
		weekname.add("tuesday");
		weekname.add("wednesday");
		weekname.add("thursday");
		weekname.add("friday");
		weekname.add("thursday");
		weekname.add(null);
		
		System.out.println(weekname);
		System.out.println(weekname.contains("thursday"));
		System.out.println(weekname.clone());
		System.out.println(weekname.getFirst());
		System.out.println(weekname.getLast());
		System.out.println(weekname.remove("thursday"));
		System.out.println(weekname);
	}

}
