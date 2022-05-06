package loops;

import java.util.Scanner;


public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int no = sc.nextInt();
		int rev = 0;
		
		while(no>0) {
			int r = no%10;
			rev = rev*10+r;
			no=no/10;
		}
		System.out.println(rev);
		sc.close();
	}

}
