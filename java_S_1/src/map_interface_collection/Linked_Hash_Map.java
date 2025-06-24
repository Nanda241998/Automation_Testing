package map_interface_collection;

import java.util.LinkedHashMap;

public class Linked_Hash_Map {

	public static void main(String[] args) {
		LinkedHashMap<String, String> company_name = new LinkedHashMap<String, String>();

		company_name.put("1", "Tcs");
		company_name.put("1", "Infosys");
		company_name.put("2", "Tcs");
		company_name.put("3", "Entrata");
		company_name.put("4", "Oracle");
		company_name.put("5", "google");
		company_name.put("6", "capgemini");
		company_name.put("7", "Cognizant");
		company_name.put("3", null);
		company_name.put(null, "Tcs");
		company_name.put(null, null);

		System.out.println(company_name);

		System.out.println(company_name.clone());

		System.out.println(company_name.isEmpty());

		System.out.println(company_name.containsKey("3"));

		System.out.println(company_name.containsValue("Cognizant"));

		System.out.println(company_name.get("4"));

		System.out.println(company_name.getOrDefault("7", "Cognizant"));

		System.out.println(company_name.getClass());

		System.out.println(company_name.isEmpty());

		System.out.println(company_name.size());
		System.out.println(company_name.replace("7", "Velsera"));
		System.out.println(company_name);
		System.out.println(company_name.remove("7"));
		System.out.println(company_name.remove("7", "Velsera"));
		System.out.println(company_name);
		company_name.clear();
		System.out.println(company_name);
		
		

	}

}
