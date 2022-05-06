package array;


public class RotatingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {1,2,3,4,5,6,7,8,9,10};
		int max = A[0];

		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max=A[i];
			}
		}
		System.out.println("Maximum Element is "+max);
	}
}
