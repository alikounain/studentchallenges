package array;

public class MultipicationOfTwo2DArray2 {

	public static void main(String[] args) {
		int [][]A= {{9,3,4},{3,1,1},{5,6,1}};
		int B[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int C[][];
		C=new int[3][3];

		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				C[i][j] = 0;
				for(int k=0;k<3;k++) {
					C[i][j]=C[i][j]+A[i][k] * B[k][j];
				}
			}
		}
		for(int x[]:C) {
			for(int y:x) {
				System.out.format(y+" ");
			}
			System.out.println();
		}
	}
}
