package loops;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number of get factorial");
		int n = sc.nextInt();
		long fact = 1;
		
		for(int i=1;i<=n;i++) {
		System.out.println(fact+" X "+i+" = "+(fact*i));
		fact=fact*i;
		}
		sc.close();
	}

}
