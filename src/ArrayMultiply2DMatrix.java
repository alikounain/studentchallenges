
public class ArrayMultiply2DMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{3,8,1},{1,2,3}};
		int b[][]= {{4,5,6},{8,6,6},{4,5,6}};
		int c[][]= new int[3][3];
		
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				c[i][j]=0;
				for (int k=0;k<3;k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (int []x:c) {
			for(int y:x)
				System.out.print(y+" ");
			System.out.println();
		}
	}
}
