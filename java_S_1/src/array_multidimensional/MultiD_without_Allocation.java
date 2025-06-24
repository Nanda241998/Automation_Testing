package array_multidimensional;

public class MultiD_without_Allocation {

	public static void main(String[] args) {
		int a[][]={{12,23,34},{33,21,42},{43,56,53},{25,67,56}};
		
		//rows--outer loop starts from 0,1,2
		//columns ---inner loop starts from 0,1,2
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("length of array is :"+a.length);
		System.out.println("index of array is:"+a[1][2]);
		
	

}
}
