package loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong or not: ");
		int n = sc.nextInt();
		int m=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum =sum + r*r*r;
			n=n/10;
		}
		System.out.println("Armstrong of "+m+" is "+sum);
		if(m==sum) {
			System.out.println(m+" is a armstrong number.");
		}
		else
			System.out.println(m+" is not a armstrong number.");
		
		sc.close();
	}
}
