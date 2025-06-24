package set_interface_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_set_String {

	public static void main(String[] args) {
		LinkedHashSet<String> Domain_name=new LinkedHashSet<String>();
		Domain_name.add("ecommerce");
		Domain_name.add("healthcare");
		Domain_name.add("ecommerce");
		Domain_name.add(null);
		Domain_name.add("banking");
		Domain_name.add("property management");
		
		Domain_name.add("institute");
		
		/*System.out.println(Domain_name);
		System.out.println(Domain_name.getFirst());
		System.out.println(Domain_name.getLast());
		System.out.println(Domain_name.getClass());
		System.out.println(Domain_name.clone());
		System.out.println(Domain_name.contains("banking"));
		System.out.println(Domain_name.size());
		System.out.println(Domain_name.remove("institute"));
		System.out.println(Domain_name);
		Domain_name.clear();
		System.out.println(Domain_name);*/
		
	Iterator<String> I= Domain_name.iterator();;
	while(I.hasNext()) {
		System.out.println(I.next());
	}
		
		
	}

}
