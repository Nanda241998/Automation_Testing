package array_Single_dimensional;

public class Array_String_Without_Allocation {

	public static void main(String[] args) {
		String week_name[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		for (String i : week_name) {
			System.out.println(i);
		}
		System.out.println("length of week_name is:" + week_name.length);
		System.out.println("index of week_name 3 is:" + week_name[3]);
		System.out.println("-----using for loop-------");
		for (int i = 0; i < 7; i++) {
			System.out.println(week_name[i]);
		}

	}

}
