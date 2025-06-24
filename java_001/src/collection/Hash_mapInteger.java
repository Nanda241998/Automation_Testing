package collection;

import java.util.HashMap;

public class Hash_mapInteger {

	public static void main(String[] args) {
		HashMap<Integer, Integer> dates=new HashMap<Integer, Integer>();
		
		dates.put(1, 2);
		dates.put(2, null);
		dates.put(3, 2);
		dates.put(1, 4);
		dates.put(4, 3);
		
		System.out.println(dates);
		System.out.println(dates.containsKey(1));
		System.out.println(dates.size());
		System.out.println(dates.replace(2, null, 5));
		System.out.println(dates);

	}

}
