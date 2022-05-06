import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		
//		int arr[] = {12,62,51,2,04,55};
		
		int arr[]=new int[5];
		System.out.println("Enter any five number to get smaller one");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int x = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<x) {
				x=arr[i];
			}
		}
		System.out.println("smallest number is "+x);
		sc.close();
	}

}
