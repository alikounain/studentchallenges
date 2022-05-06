package array;

public class IncreasingSizeOfArray {

	public static void main(String[] args) {
		int A[]= {5,6,4,54,52};
		int B[]= new int[2*A.length];
		
		System.out.println("Size of A is "+A.length);
		
		for(int x:A)
			System.out.print(x+",");
		
		for(int i=0;i<A.length;i++)
			B[i]=A[i];
		
			A=B;
			B=null;
			System.out.println();
			System.out.println("Size of A is "+A.length);
			for(int x:A)
				System.out.print(x+",");
	}
}
