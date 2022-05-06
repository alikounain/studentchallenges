package array;

public class CopyingAnArray {

	public static void main(String[] args) {
		int A[]= {5,6,4,54,52,15,21,26,121,2};
		int B[]= new int[10];
		
		for(int i=0;i<A.length;i++) {
			B[i]=A[i];
		}
		for(int x:B) {
			System.out.print(x+",");
		}
		
	}
}
