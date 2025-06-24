package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_Float {

	public static void main(String[] args) {
		LinkedList<Float> testcasespassed = new LinkedList<Float>();

		testcasespassed.add( 300.3f);
		testcasespassed.add( 400.2f);
		testcasespassed.add(30.1f);
		testcasespassed.add( 20.9f);
		testcasespassed.add( 10.8f);
		testcasespassed.add( 50.8f);
		testcasespassed.add( 700.8f);
		testcasespassed.add( 80.2f);
		testcasespassed.add(60.7f);

		/*System.out.println(testcasespassed);
		System.out.println(testcasespassed.clone());
		System.out.println(testcasespassed.contains(60.7f));
		System.out.println(testcasespassed.equals(testcasespassed));
		System.out.println(testcasespassed.isEmpty());

		System.out.println(testcasespassed.indexOf(20.9f));
		System.out.println(testcasespassed.lastIndexOf(30.1f));
		System.out.println(testcasespassed.size());
		System.out.println(testcasespassed.remove(700.8f));
		System.out.println(testcasespassed);
		
		for(int i=1;i<=100;i++) {
			testcasespassed.add((float) i);
		}
		System.out.println(testcasespassed);*/
		
		Iterator<Float> i=testcasespassed.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
