package collection;

import java.util.HashSet;

public class Hash_Set_byte {

	public static void main(String[] args) {
		HashSet<Byte> marks= new HashSet<Byte>();
		
		marks.add((byte) 35);//0
		marks.add((byte) 36);//1
		marks.add((byte) 35);//2
		marks.add((byte) 37);//3
		marks.add((byte) 38);//4
		marks.add((byte) 39);//5
		marks.add((byte) 40);//6
		marks.add((byte) 46);//7
		marks.add((byte) 45);//8
		marks.add((byte) 86);//9
		
		System.out.println(marks);
		
		System.out.println(marks.clone());
		System.out.println(marks.contains((byte) 35));
		System.out.println(marks.equals( marks));
		System.out.println(marks.isEmpty());
		System.out.println(marks.size());
		System.out.println(marks.remove((byte)(40)));
		System.out.println(marks);
		
		

	}

}
