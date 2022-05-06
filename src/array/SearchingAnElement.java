package array;

import java.util.Scanner;

public class SearchingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {24,11,215,15,02,1515,55,62};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key");
		int key = sc.nextInt();

		for(int i=0;i<A.length;i++) {
			if(key==A[i]) {
				System.out.print("Element Found at "+(i+1));
				System.exit(0);
			}
		}
		System.out.println("Not found");
		sc.close();
	}
}
