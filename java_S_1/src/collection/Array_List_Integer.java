package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Integer {

	public static void main(String[] args) {
	ArrayList<Integer> rollno = new ArrayList<Integer>();
	
	rollno.add(12);
	rollno.add(23);
	rollno.add(24);
	rollno.add(25);
	rollno.add(24);
	rollno.add(null);
	rollno.add(32);
	/*
	System.out.println(rollno);
	System.out.println(rollno.clone());
	System.out.println(rollno.contains(25));
	System.out.println(rollno.equals(rollno));
	System.out.println(rollno.isEmpty());
	System.out.println(rollno.indexOf(32));
	System.out.println(rollno.lastIndexOf(32));
	//System.out.println(rollno.removeFirst());
	System.out.println(rollno.size());*/
	
	Iterator<Integer> i=rollno.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}

}
