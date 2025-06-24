package array_multidimensional;

public class Array_MultiD_String {

	public static void main(String[] args) {
		String a[][] = new String[4][3];
		a[0][0] = "java";
		a[0][1] = "api";
		a[0][2] = "mobile";
		
		a[1][0]="c";
		a[1][1]="c++";
		a[1][2]="python";
		
		
		a[2][0]="algorithm";
		a[2][1]="javascript";
		a[2][2]="manual";
		
		a[3][0] = "automation";
		a[3][1]="postman";
		a[3][2]="github";
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		
		

	}

}
