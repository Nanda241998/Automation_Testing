package constructor;

public class User_Defined_Constructor {
	
	//default constructor can call constructor directly no need to call in method.
	
	int a=34;
	float f=23.3f;
	String s="java";
	public void Instance() {
		System.out.println(f);
	}
	public  User_Defined_Constructor () {
		System.out.println("Default constructor");
		System.out.println(a);
	}

	public static void main(String[] args) {
		 User_Defined_Constructor d=new  User_Defined_Constructor();
		 d.Instance();

	}

}
