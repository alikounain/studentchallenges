package loops;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int no = sc.nextInt();
		int temp=no;
		int rev = 0;
		
		while(no>0) {
			int r = no%10;
			rev = rev*10+r;
			no=no/10;
		}
		if(temp==rev)
			System.out.println(temp+" is a palindrome number.");
		else
			System.out.println(temp+" is not a palindrome number.");
		
		sc.close();
	}

}
