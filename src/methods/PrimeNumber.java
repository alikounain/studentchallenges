package methods;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++) {
		
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number to check prime");
		int no=sc.nextInt();
		
		System.out.println(isPrime(no));
		
		
		sc.close();
	}

}
