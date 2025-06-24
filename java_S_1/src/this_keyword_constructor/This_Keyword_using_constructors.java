package this_keyword_constructor;

public class This_Keyword_using_constructors {
	
	public This_Keyword_using_constructors () {
		System.out.println("user defined constructor");
	}
	public This_Keyword_using_constructors(int a) {
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		This_Keyword_using_constructors  r= new This_Keyword_using_constructors (23);
		

	}

}
