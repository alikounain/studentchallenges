package conditionalstatement;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check odd or even");
		int no = sc.nextInt();
		if (no%2==0) {
			System.out.println(no+" is a even number");
		}
		else {
			System.out.println(no+" is a odd number");
		}
		sc.close();
	}
}
