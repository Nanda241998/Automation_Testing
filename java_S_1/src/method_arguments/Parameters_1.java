package method_arguments;

public class Parameters_1 {
	int a;
	int b;
	float f;
	boolean c= a>b;
	 int g;
	 int i;
	 float l;
	
	public void IM(int d,int e, float j) {
		
		a=d;
		b=e;
		f=j;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	
		
	}
	
	public static void SM(int k, int y,float t) {
		Parameters_1 r= new Parameters_1();
		/*g=k;
		i=y;
		l=t;*/
		System.out.println(r.g=k);
		System.out.println(r.i=y);
		System.out.println(r.l=t);
	}
	
	public static void main(String[] args) {
		Parameters_1 r= new Parameters_1();
		r.IM(32,44,55.4f);
		SM(11,22,32.3f);
	}
}
