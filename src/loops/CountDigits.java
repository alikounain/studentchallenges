package loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to count number of digits");
		int n = sc.nextInt();
		int count=0;
		while(n>0) {
			n = n/10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
