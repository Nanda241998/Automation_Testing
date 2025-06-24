package array_Single_dimensional;

public class Array_String_with_allocation {

	public static void main(String[] args) {

		String month_name[] = new String[5];
		month_name[0] = "January";
		month_name[1] = "February";
		month_name[2] = "March";
		month_name[3] = "April";
		month_name[4] = "May";

		for (String i : month_name) {
			System.out.println("Month name is:" + i);
		}
		System.out.println("length of month_name is:" + month_name.length);
		System.out.println("index of month_name 4 is:" + month_name[4]);
		for (int j = 0; j < 5; j++) {
			System.out.println(month_name[j]);
		}

	}

}
