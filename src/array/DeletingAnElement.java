package array;


public class DeletingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= new int[10];
		A[0]=3;A[1]=5;A[2]=36;A[3]=79;A[4]=84;A[5]=66;

		int n=6;

		for(int i=0;i<n;i++)
			System.out.print(A[i]+",");
		System.out.println();
		
		int index=3; 

		for(int i=index;i<n;i++)
			A[i]=A[i+1];
		
		for(int i=0;i<n;i++)
			System.out.print(A[i]+",");
		System.out.println();
	}
}
