package loops;

import java.util.Scanner;

public class DisplayDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to display digits");
		int n = sc.nextInt();
		
		while(n!=0) {
			int r = n%10;
			System.out.println(r);
			n = n/10;
		}
		sc.close();
	}

}
