package array;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum += A[i];
			System.out.print(sum+",");
		}
	}

}
