package array;

public class Duplicates_Array {

	public static void main(String[] args) {
		int a[]= {100,400,300,200,200,100,400};
		   
		int num=100;
		int count=0;
		
		for(int i:a) {
			if(num==i) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
