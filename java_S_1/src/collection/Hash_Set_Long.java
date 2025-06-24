package collection;

import java.util.HashSet;

public class Hash_Set_Long {

	public static void main(String[] args) {
		HashSet<Long> emp_id = new HashSet<Long>();

		emp_id.add((long) 1023);
		emp_id.add((long) 1023);
		emp_id.add((long) 2023);
		emp_id.add((long) 3023);
		emp_id.add((long) 4023);
		emp_id.add((long) 5023);
		emp_id.add((long) 6023);
		emp_id.add((long) 7023);
		emp_id.add((long) 8023);

		System.out.println(emp_id);
		
		System.out.println(emp_id.isEmpty());
		System.out.println(emp_id.contains((long)8023));
		System.out.println(emp_id.clone());
		System.out.println(emp_id.getClass());
		System.out.println(emp_id.size());
		//System.out.println(emp_id.iterator());
	}

}
