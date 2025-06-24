package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_String {

	public static void main(String[] args) {
	HashSet<String> cityname= new HashSet<String>();
	cityname.add("pune");
	cityname.add("nagpur");
	cityname.add("wardha");
	cityname.add("chandrapur");
	cityname.add("hinganghat");
	cityname.add("hinganghat");
	cityname.add(null);
	//System.out.println(cityname);

	Iterator<String> name= cityname.iterator();
	
	while(name.hasNext()) {
		System.out.println(name.next() );
	}

	
	}

}
