package loops;

import java.util.Scanner;

public class APSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting term");
		int a = sc.nextInt();
		System.out.println("Enter Common difference");
		int d = sc.nextInt();
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		
		int term =a;
		for(int i=0;i<n;i++) {
			
			System.out.print(term+",");
			term += d;
		}
		sc.close();
	}
}
