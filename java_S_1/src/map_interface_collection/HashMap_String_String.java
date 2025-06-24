package map_interface_collection;

import java.util.HashMap;

public class HashMap_String_String {

	public static void main(String[] args) {
		HashMap<String, String> language_name=new HashMap<String, String>();
		
		language_name.put("c", "Dennis Ritchie");
		language_name.put("c++", "Bjarne Stroustrup");
		language_name.put("c#", "microsoft");
		language_name.put("java", "sun microsystem");
		language_name.put("oracle", "Larry Ellison");
		language_name.put("javascript", "Brendan Eich");
		language_name.put("html", "Tim Berners-Lee");
		language_name.put("css", "Håkon Wium Lie");
		
		System.out.println(language_name);
		System.out.println(language_name.isEmpty());
		System.out.println(language_name.clone());
		System.out.println(language_name.containsKey("html"));
		System.out.println(language_name.containsValue("microsoft"));
		System.out.println(language_name.size());
		System.out.println(language_name.get("c"));
		System.out.println(language_name.remove("css"));
		System.out.println(language_name);
		
		

	}

}
