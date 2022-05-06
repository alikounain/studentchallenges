package methods;

import java.util.Scanner;

public class GCDOf2Numbers {

	static int gcd(int m,int n) {

		while(n!=m)
		{
			if(m>n)
				m=m-n;
			else
				n=n-m;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers to get HCF");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(gcd(m, n));
		sc.close();
	}
}
