package collection;

import java.util.LinkedList;

public class Linked_listIntegerr {

	public static void main(String[] args) {
		LinkedList<Integer> whole_no=new LinkedList<Integer>();
		whole_no.add(1);
		whole_no.add(2);
		whole_no.add(3);
		whole_no.add(4);
		whole_no.add(5);
		whole_no.add(6);
		
		System.out.println(whole_no);
		System.out.println(whole_no.contains(3));
		System.out.println(whole_no.get(3));
		System.out.println(whole_no.isEmpty());
		System.out.println(whole_no.clone());

	}

}
