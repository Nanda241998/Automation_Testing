package collection;

import java.util.LinkedList;

public class Linked_listString {

	public static void main(String[] args) {
		LinkedList<String> month_name= new LinkedList<String>();
		month_name.add("january");
		month_name.add("february");
		month_name.add("march");
		month_name.add("april");
		month_name.add("may");
		month_name.add("june");
		month_name.add("july");
		month_name.add("august");
		month_name.add("september");
		month_name.add("october");
		month_name.add("november");
		month_name.add("december");
		month_name.add(null);
		month_name.add("december");
		
		System.out.println(month_name);
		System.out.println(month_name.size());

	}

}
