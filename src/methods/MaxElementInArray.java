package methods;

public class MaxElementInArray {

	static int max(int []A) {
		int x=A[0];
		for (int i=0;i<A.length;i++)
		{
			if(A[i]>x)
				x=A[i];
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []max= {1,66,74,97,32};
		System.out.println(max(max));
	}

}
