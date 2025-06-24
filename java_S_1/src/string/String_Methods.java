package string;

public class String_Methods {

	public static void main(String[] args) {

		String a = "Software Developer";

		System.out.println("-----isEmpty Method----");
		// isEmpty method when characters present.
		System.out.println(a.isEmpty());

		// isEmpty method when characters not present.
		String b = "";
		System.out.println(b.isEmpty());
		// length method specifies length of characters in digits.
		System.out.println("----length method----");
		System.out.println(a.length());

		// indexOf method specifies the ranking of characters.
		System.out.println("------indexOf------");
		System.out.println(a.indexOf("t"));

		// replace method specifies the values from old to new char.
		System.out.println("------replace-----");
		System.out.println(a.replace("Software", "full stack"));

		// charAt method specifies the character rank.
		System.out.println("--------charAt------");
		System.out.println(a.charAt(4));

		// toLowercase method converts from uppercase letters to the lowercase letters.
		System.out.println("------toLowercase------");
		String c = "SALESFORCE DEVELOPER";
		System.out.println(c.toLowerCase());

		// toUppercase method converts from Lowercase to Uppercase.
		System.out.println("-------toUppercase------");
		String d = "software development test engineer";
		System.out.println(d.toUpperCase());
		
		//substring method return the character with the help of indexes.
		System.out.println("-----substring------");
		String e= "API Project";
		System.out.println(e.substring(4));
		System.out.println(e.substring(0, 4));
		System.out.println(e.substring(3, 10));

		//trim method removes the space form the string.
		String f= "       Application Developer      ";
		System.out.println(f.trim());
		System.out.println(f.substring(7));
		
		//concat method joins string using + operator.
		
		String g= "Java is an ";
		String f1= "Popular Language";
		System.out.println(g.concat("Popular Language."));
		System.out.println(g+"Popular language.");
		System.out.println(g+f1);
		System.out.println(g);
		
		//contains method return boolean values if characters are present in the string.
		String h= "Test Analyst";
		System.out.println(h.contains("n"));
		System.out.println(h.contains("m"));
		
		//equals method return boolean values if both strings values are equal.
		String i= "Test Engineer";
		String j= "test engineer";
		String k= "Test Engineer";
		
		
		System.out.println(i.equals(j));
		System.out.println(i.equals(k));
		
		//equalsIgnorescase method returns equal strings not considering capital & small letters.
		System.out.println(i.equalsIgnoreCase(j));
		
		//endsWith method return boolean values in  string with the help of ending characters);
		System.out.println(i.endsWith("en"));//false
		System.out.println(i.endsWith("eer"));
		String m="java";
		String l="Automation";
	System.out.println(m.concat(" "+l));
	}

}
