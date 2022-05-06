package array;


public class InsertingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= new int[10];
		A[0]=3;A[1]=5;A[2]=36;A[3]=48;A[4]=84;A[5]=66;A[6]=95;

		int n=6;

		for(int i=0;i<n;i++)
			System.out.print(A[i]+",");
		System.out.println();
		
		int x=20;
		int index=2; 

		for(int i=n;i>index;i--)
			A[i]=A[i-1];
		A[index]=x;
		
		for(int i=0;i<n;i++)
			System.out.print(A[i]+",");
		System.out.println();
	}
}
