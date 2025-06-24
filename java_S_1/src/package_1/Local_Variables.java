package package_1;

public class Local_Variables {
	
	//declaring for local variables.
	
	
	public  void local_v() {
		int p=12;
		short s=78;
		
		long g=p+s;
		System.out.println(g);
		
	}
	
	public static void local_s() {
		int f=56;
		int j=77;
		long b=f+j;
				System.out.println(b);
		
	}
	
	public static void main (String[]args) {
		Local_Variables r=new Local_Variables();
		
		r.local_v();
		local_s();
		
	}
}
