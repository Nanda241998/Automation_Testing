package map_interface_collection;

import java.util.HashMap;

public class Hash_Map_Integer {

	public static void main(String[] args) {
		HashMap<Integer, String> Emp_name= new HashMap<Integer, String>();
		
		Emp_name.put(1, "Shashwat");
		Emp_name.put(1, "Nanda");
		Emp_name.put(2, "Shashwat");
		Emp_name.put(3, "Shashank");
		Emp_name.put(4, "Ragini");
		Emp_name.put(5, "Vaishnavi");
		Emp_name.put(6, "Akash");
		Emp_name.put(7, "Akshay");
		Emp_name.put(8, "Shantanu");
		Emp_name.put(9, "Seema");
		Emp_name.put(null, null);
		Emp_name.put(1, null);
		Emp_name.put(null, "Shashwat");
		
		System.out.println(Emp_name);
		
		System.out.println(Emp_name.get(9));
		System.out.println(Emp_name.containsKey(2));
		System.out.println(Emp_name.clone());
		System.out.println(Emp_name.isEmpty());
		System.out.println(Emp_name.containsValue("Shashwat"));
	
		System.out.println(Emp_name.replace(2, "ojas"));
		System.out.println(Emp_name);
		System.out.println(Emp_name.replace(3, "Shashank", "shourya"));
		System.out.println(Emp_name);
		System.out.println(Emp_name.remove(4));
		System.out.println(Emp_name.remove(5, "Vaishnavi"));
		System.out.println(Emp_name);
		Emp_name.clear();
		System.out.println(Emp_name);
		
		
	}

}
