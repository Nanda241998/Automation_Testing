package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_Date_Format {

	public static void main(String[] args) {
		Date d = new Date();

		SimpleDateFormat s = new SimpleDateFormat("dd:MM:yyyy");

		System.out.println(s.format(d));

		System.out.println("---------------------");

		SimpleDateFormat f = new SimpleDateFormat("dd:MM:yyyy  hh:mm:ss");

		System.out.println(f.format(d));

		System.out.println("----------------");
		SimpleDateFormat e = new SimpleDateFormat("hh:mm:ss");
		System.out.println(e.format(d));

	}

}
