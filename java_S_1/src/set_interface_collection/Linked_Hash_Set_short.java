package set_interface_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_Set_short {

	public static void main(String[] args) {
		LinkedHashSet<Short> odd_no=new LinkedHashSet<Short>();
		
		 odd_no.add((short) 1);
		 odd_no.add((short) 3);
		 odd_no.add((short) 5);
		 odd_no.add((short) 7);
		 odd_no.add((short) 1);
		 odd_no.add((short) 9);
		 odd_no.add((short) 11);
		 odd_no.add((short) 13);
		 odd_no.add((short) 15);
		 
		/* System.out.println(odd_no);
		 
		 System.out.println(odd_no.clone());
		 System.out.println(odd_no.contains((short)9));
		 System.out.println(odd_no.getClass());
		 System.out.println(odd_no.getFirst());
		 System.out.println(odd_no.getLast());
		 System.out.println(odd_no.isEmpty());
		 System.out.println(odd_no.size());
		 System.out.println(odd_no.equals(11));
		 System.out.println(odd_no.removeFirst());
		 System.out.println(odd_no.removeLast());
		 
		 System.out.println(odd_no.remove((short)15));
		 System.out.println(odd_no);
		 odd_no.clear();
		 System.out.println(odd_no);
		 */
		 for(int i=1;i<=100;i++) {
			 if(i%1==0) {
				 odd_no.add((short) i);
			 }
			 
		 }System.out.println(odd_no);
		 
		 /*Iterator<Short> i= odd_no.iterator();
		 
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		*/
		 
		 
	}

}
