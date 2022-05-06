package conditionalstatement;

import java.util.Scanner;

public class RadixNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String num = sc.nextLine();

		if(num.matches("[01]+")) {
			System.out.println(num+" is a binary number");
		}
		else if (num.matches("[0-7]+")) {
			System.out.println(num+" is a octal number");
		}
		sc.close();	
	}
}
