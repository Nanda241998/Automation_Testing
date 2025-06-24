package collection;

import java.util.LinkedList;

public class Linked_list_Integer {

	public static void main(String[] args) {
		LinkedList<Integer> month_no=new LinkedList<Integer>();
		month_no.add(1);
		month_no.add(2);
		month_no.add(3);
		month_no.add(4);
		month_no.add(4);
		month_no.add(5);
		month_no.add(6);
		month_no.add(7);
		month_no.add(8);
		month_no.add(9);
		month_no.add(10);
		month_no.add(11);
		month_no.add(12);
		
		System.out.println(month_no);
		System.out.println(month_no.size());
		System.out.println(month_no.get(3));
		System.out.println(month_no.getClass());
		System.out.println(month_no.getFirst());
		System.out.println(month_no.getLast());
		
		System.out.println(month_no.remove(9));
		System.out.println(month_no);
		System.out.println(month_no.clone());
		
		System.out.println(month_no.contains(3));
		System.out.println(month_no.equals(month_no));
		
		System.out.println(month_no.indexOf(4));
		System.out.println(month_no.isEmpty());
		System.out.println(month_no.element());
		
		
		

	}

}
