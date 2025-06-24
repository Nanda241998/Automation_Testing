package set_interface_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_String {

	public static void main(String[] args) {
		HashSet<String> Application_name = new HashSet<String>();

		Application_name.add("flipcart");
		Application_name.add("Amazon");
		Application_name.add("myntra");
		Application_name.add("meesho");
		Application_name.add("google photos");
		Application_name.add("chrome");
		Application_name.add("edge");
		Application_name.add("phonepay");
		Application_name.add("flipcart");
		Application_name.add("googlepay");

		/*System.out.println(Application_name);

		System.out.println(Application_name.clone());
		System.out.println(Application_name.contains("googlepay"));

		System.out.println(Application_name.isEmpty());

		System.out.println(Application_name.remove("googlepay"));

		System.out.println(Application_name);

		Application_name.clear();

		System.out.println(Application_name);
		
		for(int i=1;i<=5;i++) {
			System.out.println(Application_name);
			
		}*/
		
		Iterator<String> i=Application_name.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		

	}

}
