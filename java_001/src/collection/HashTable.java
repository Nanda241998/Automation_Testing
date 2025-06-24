package collection;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<String, String> weekno= new Hashtable<String, String>();
		
		weekno.put("naukri","https://www.naukri.com/" );
		weekno.put("amazon", "https://www.amazon.in/");
		weekno.put("flipcart", "https://www.flipkart.com/");
		weekno.put("naukri", "hash");
		weekno.put("chrome", "chrome.com");
		weekno.put("chrome", "chrome");
		//weekno.put("linkedin", "null");
		
		System.out.println(weekno);
		System.out.println(weekno.replace("chrome", "google"));

	}

}
