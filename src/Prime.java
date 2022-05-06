import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check prime");
		int n=sc.nextInt();
		if (n==0 || n == 1) {
			System.out.println(n+" is not prime");
		}
		else {
			for (int i=2; i<= n/2; i++) {
				if (n%i==0) {
					System.out.println("number is not prime");
					System.exit(0);
				}
			}
			System.out.println("number is prime");
		}
		sc.close();
	}

}
