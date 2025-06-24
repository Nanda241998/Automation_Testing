package collection;

import java.util.ArrayList;

public class Array_List_String {

	public static void main(String[] args) {
		ArrayList<String> Week_name= new ArrayList<String>();
		
		
		Week_name.add("Monday");
		Week_name.add("tuesday");
		
		Week_name.add("Wednesday");
		Week_name.add("Thursday");
		
		Week_name.add("Friday");
		Week_name.add("Saturday");
		
		Week_name.add("Sunday");
		
		System.out.println(Week_name);

		System.out.println(Week_name.clone());
		System.out.println(Week_name.contains("Wednesday"));
		System.out.println(Week_name.equals(Week_name));
		
		System.out.println(Week_name.getFirst());
		System.out.println(Week_name.getLast());
		System.out.println(Week_name.remove(2));
		System.out.println(Week_name);
		System.out.println(Week_name.indexOf("Sunday"));
		System.out.println(Week_name.isEmpty());
		System.out.println(Week_name.removeFirst());
		System.out.println(Week_name);

	}

}
