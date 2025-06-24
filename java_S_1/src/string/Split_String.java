package string;

public class Split_String {

	public static void main(String[] args) {
	String s="My name is nanda";
	
	String []a= s.split("a");
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	//System.out.println(a[3]);
	
	String s1= "My husband name is shashwat kawale";
	
	String []c=s1.split(" ");
	
	System.out.println(c[0]);
	System.out.println(c[1]);
	System.out.println(c[2]);
	System.out.println(c[3]);
	System.out.println(c[4]);

	}

}
