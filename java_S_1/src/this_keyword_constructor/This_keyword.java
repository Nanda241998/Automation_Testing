package this_keyword_constructor;

public class This_keyword {
	int a=90;
	float f=34.4f;
	String s="java";
	public void Instance() {
		System.out.println(a);
	}
	public This_keyword() {
		this.Instance();
		System.out.println(s);
	}

	public static void main(String[] args) {
		This_keyword r=new This_keyword();
	}

}
