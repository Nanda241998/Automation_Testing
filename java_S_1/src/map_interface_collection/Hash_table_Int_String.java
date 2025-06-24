package map_interface_collection;

import java.util.Hashtable;

public class Hash_table_Int_String {

	public static void main(String[] args) {
		Hashtable<Integer, String> mobile_name = new Hashtable<Integer, String>();

		mobile_name.put(1, "realme");
		mobile_name.put(2, "realme");
		mobile_name.put(1, "vivo");
		mobile_name.put(3, "samsung");
		mobile_name.put(4, "iphone");
		mobile_name.put(5, "oppo");
		mobile_name.put(6, "redmi");
		mobile_name.put(7, "nokia");
		mobile_name.put(8, "googlepixel");
		//mobile_name.put(9, null);
		

		System.out.println(mobile_name);

		System.out.println(mobile_name.clone());

		System.out.println(mobile_name.isEmpty());

		System.out.println(mobile_name.size());

		System.out.println(mobile_name.contains("nokia"));
		

		System.out.println(mobile_name.containsKey(1));

		System.out.println(mobile_name.get(2));

		System.out.println(mobile_name.getClass());

		System.out.println(mobile_name.replace(3, "samsung"));

		System.out.println(mobile_name.replace(6, "redmi", "poco"));

		System.out.println(mobile_name);

		System.out.println(mobile_name.remove(7));

		System.out.println(mobile_name);

	}

}
