package conditionalstatement;

import java.util.Scanner;

public class CheckYoung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age>=14 && age <=55) {
			System.out.println("you are young");
		}
		else {
			System.out.println("you are not young");
		}
		sc.close();
	}
}
