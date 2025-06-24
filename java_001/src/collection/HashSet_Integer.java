package collection;

import java.util.HashSet;

public class HashSet_Integer {

	public static void main(String[] args) {
		HashSet<Integer> even_no= new HashSet<Integer>();
		
		even_no.add(null);
		even_no.add(2);
		even_no.add(4);
		even_no.add(6);
		even_no.add(8);
		even_no.add(10);
		
		System.out.println(even_no);
	}

}
