package array;

public class ReverseCopingAnArray {

	public static void main(String[] args) {
		int A[]= {5,6,4,54,52,15,21,26,121,2};
		int B[]= new int[10];
		
		for(int x:A)
			System.out.print(x+",");
		System.out.println();
		
		for(int i=A.length-1, j=0;i>=0;i--,j++) {
			B[j]=A[i];
		}
		for(int x:B)
			System.out.print(x+",");
		
	}
}
