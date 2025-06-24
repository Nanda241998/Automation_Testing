package collection;

import java.util.LinkedList;

public class Linked_list_String {

	public static void main(String[] args) {
		LinkedList<String> applicationname=new LinkedList<String>();
		applicationname.add("Whatsapp");
		applicationname.add("Instagram");
		applicationname.add("flipcart");
		applicationname.add("amazon");
		applicationname.add("eclipse");
		applicationname.add("intelligi");
		applicationname.add("myntra");
		applicationname.add("google");
		applicationname.add("microsoft");
		applicationname.add("twitter");
		
		System.out.println(applicationname);
		System.out.println(applicationname.size());
		System.out.println(applicationname.clone());
		System.out.println(applicationname.get(3));
		System.out.println(applicationname.getFirst());
		System.out.println(applicationname.getLast());
		System.out.println(applicationname.contains("myntra"));
		
		System.out.println(applicationname.remove("twitter"));
		System.out.println(applicationname);
		
		System.out.println(applicationname.equals(applicationname));
		System.out.println(applicationname.isEmpty());
		System.out.println(applicationname.indexOf("eclipse"));
	
		
		

	}

}
