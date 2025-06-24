package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Float {

	public static void main(String[] args) {
		ArrayList<Float> Decimal =new ArrayList<Float>();
		
		Decimal.add(12.3f);
		Decimal.add(89.8f);
		Decimal.add(34.4f);
		Decimal.add(12.3f);
		Decimal.add(89.8f);
		Decimal.add(35.4f);
		Decimal.add(19.3f);
		Decimal.add(88.8f);
		Decimal.add(78.4f);
		
		/*System.out.println(Decimal);
		
		System.out.println(Decimal.clone());
		System.out.println(Decimal.contains(35.4f));
		System.out.println(Decimal.equals(Decimal));
		System.out.println(Decimal.indexOf(34.4f));
		System.out.println(Decimal.isEmpty());
		System.out.println(Decimal.lastIndexOf(78.4f));
		System.out.println(Decimal.remove(89.8f));
		System.out.println(Decimal);
		System.out.println(Decimal.size());
		
		for(int i=1;i<=100;i++) {
			Decimal.add((float) i);
			
		}
		System.out.println(Decimal);*/
		
		
		Iterator<Float> r= Decimal.iterator();
		
		while(r.hasNext()) {
			System.out.println(r.next());
		}
	}

}
