package set_interface_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hash_set_Float {

	public static void main(String[] args) {
	LinkedHashSet<Float> Decimals_no=new LinkedHashSet<Float>();
	 Decimals_no.add(12.2f);
	 Decimals_no.add(23.3f);
	 Decimals_no.add(12.2f);
	 Decimals_no.add(43.3f);
	 Decimals_no.add(52.2f);
	 Decimals_no.add(63.3f);
	 
	 Decimals_no.add(82.2f);
	 Decimals_no.add(73.3f);
	 System.out.println(Decimals_no);
	 System.out.println(Decimals_no.size());
	 System.out.println(Decimals_no.clone());
	 System.out.println(Decimals_no.contains(63.3f));
	 System.out.println(Decimals_no.isEmpty());
	 
	 System.out.println(Decimals_no.remove(63.3f));
	 System.out.println(Decimals_no);
	 
	 Iterator<Float> i=Decimals_no.iterator();
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }

	}

}
