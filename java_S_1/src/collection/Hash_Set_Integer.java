package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_Integer {

	public static void main(String[] args) {
		HashSet<Integer> whole_num=new HashSet<Integer>();
		
		whole_num.add(1);
		whole_num.add(2);
		whole_num.add(3);
		whole_num.add(4);
		whole_num.add(5);
		whole_num.add(6);
		whole_num.add(7);
		whole_num.add(8);
		whole_num.add(9);
		whole_num.add(10);
		
		/*System.out.println(whole_num);
		System.out.println(whole_num.clone());
		System.out.println(whole_num.contains(9));
		System.out.println(whole_num.isEmpty());
		System.out.println(whole_num.size());
		System.out.println(whole_num.getClass());
		System.out.println(whole_num.remove(10));
		System.out.println(whole_num);
		whole_num.clear();
		System.out.println(whole_num);
		
		
		for(int i=1;i<=100;i++) {
			whole_num.add(i);
		}
		System.out.println(whole_num);*/
		
		Iterator<Integer> i=whole_num.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
