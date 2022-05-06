package array;

public class SumOfTwo2DArray {

	public static void main(String[] args) {
		int [][]A= {{9,3,4},{3,1,1},{5,6,1}};
		int B[][]= {{1,4,6},{8,2,9},{3,4,3}};
		int C[][];
		C=new int[3][3];
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for(int x[]:C) {
			for(int y:x) {
				System.out.format("%02d ",y);
			}
		System.out.println();
		}
	}
}
