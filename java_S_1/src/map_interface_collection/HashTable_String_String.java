package map_interface_collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable_String_String {

	public static void main(String[] args) {
		Hashtable<String, String> city_name= new Hashtable<String, String>();
		city_name.put("8", "pune");
		city_name.put("1", "pune");
		city_name.put("1", "mumbai");
		city_name.put("2", "Nagpur");
		city_name.put("3", "solapur");
		city_name.put("4", "chandrapur");
		city_name.put("5", "higanghat");
		city_name.put("6", "wardha");
		city_name.put("7", "satara");
		city_name.put("9", "sangli");
		//city_name.put("10", null);
		
		System.out.println(city_name);
		
		System.out.println(city_name.clone());
		
		System.out.println(city_name.size());
		System.out.println(city_name.get("9"));
		System.out.println(city_name.getOrDefault("7", null));
		System.out.println(city_name.contains("sangli"));
		System.out.println(city_name.containsKey("6"));
		System.out.println(city_name.isEmpty());
		System.out.println(city_name.entrySet());
		
		/*Set<Map.Entry<String,String>> entries= city_name.entrySet();
		
		for(Map.Entry<String,String>entry:entries) {
			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
		}*/
		
		for(String name:city_name.keySet()) {
			System.out.println(name);
		} 
		
		for(String value:city_name.values()) {
			System.out.println(value);
		}
		
		
	}

}
