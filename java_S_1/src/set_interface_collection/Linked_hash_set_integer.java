package set_interface_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hash_set_integer {

	public static void main(String[] args) {

		LinkedHashSet<Integer> even_no = new LinkedHashSet<Integer>();
		
		even_no.add(2);
		even_no.add(4);
		even_no.add(6);
		even_no.add(8);
		even_no.add(10);
		even_no.add(12);
		even_no.add(14);
		even_no.add(16);
		even_no.add(18);
		even_no.add(20);
		
		/*System.out.println(even_no);
		System.out.println(even_no.clone());
		System.out.println(even_no.contains(20));
		System.out.println(even_no.isEmpty());
		System.out.println(even_no.size());
		System.out.println(even_no.getFirst());
		System.out.println(even_no.getLast());
		System.out.println(even_no.getClass());
		System.out.println(even_no.remove(18));
		System.out.println(even_no);
		even_no.clear();
		System.out.println(even_no);*/
		
		Iterator<Integer> o= even_no.iterator();
		
		while(o.hasNext()) {
			System.out.println(o.next());
		}
		
		for(int i=1;i<=200;i++) {
			if(i%2==0) {
				even_no.add(i);
			}
		}
		System.out.println(even_no);
		
	}

}
