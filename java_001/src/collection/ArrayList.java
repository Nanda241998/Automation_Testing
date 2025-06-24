package collection;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
	java.util.ArrayList<Integer> cityno= new java.util.ArrayList<Integer>();
	
	cityno.add(1);
	cityno.add(2);
	cityno.add(3);
	cityno.add(4);
	cityno.add(5);
	cityno.add(null);
	cityno.add(1);
	
	//System.out.println(cityno);
	
	Iterator<Integer> i=cityno.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}

	}

}
