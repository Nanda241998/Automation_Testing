package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
	LinkedHashSet<Integer> odd_no= new LinkedHashSet<Integer>();
	
	odd_no.add(1);
	odd_no.add(3);
	odd_no.add(5);
	odd_no.add(7);
	odd_no.add(9);
	
	//System.out.println(odd_no);
	
	Iterator<Integer> i= odd_no.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	

	}

}
