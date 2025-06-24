package array_Topics;

public class Reverse_an_Array {

	public static void main(String[] args) {
		System.out.println("---------using reversing int------");
		int a[] = { 12, 34, 56, 65, 65 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("the value of reversing int is:"+a[i]);

		}
		System.out.println("------using reversing string--------");
		String s[]= {"java","python","c","c++"};
		for(int i=3;i>=0;i--) {
			System.out.println("the value of reversing string is:"+s[i]);
		}
		System.out.println("--------Using reversing Float----------");
		float f[]= {23.4f,56.4f,43.2f,23.4f,54.5f};
		for(int i=4;i>=0;i--) {
			System.out.println("the value of reversing float is:"+f[i]);
		}
	}

}
