package variables;

     public class Test {
 	

     public void Practise_Instance() {
    	 int e =89;
    	 System.out.println(e);
	
     }
     
     public static void Practise_static() {
    	 //Test r= new Test();
    	 int f=34;
    	 System.out.println(f);
     }
	public static void main(String[] args) {
		Test r= new Test();
		r.Practise_Instance();
		Practise_static();
		
	}
}
