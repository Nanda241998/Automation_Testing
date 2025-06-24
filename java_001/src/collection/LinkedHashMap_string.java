package collection;

import java.util.LinkedHashMap;

public class LinkedHashMap_string {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> month_name=new LinkedHashMap<Integer, String>();
		month_name.put(1, "january");
		month_name.put(2, "february");
		month_name.put(3, "march");
		month_name.put(4, "april");
		month_name.put(5, "may");
		month_name.put(6,"june");
		month_name.put(6, "july");
		month_name.put(7, "july");
		month_name.put(8, null);
		
		System.out.println(month_name);
	}

}
