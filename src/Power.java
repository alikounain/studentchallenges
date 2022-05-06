import java.math.BigInteger;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a,c;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextBigInteger();
		b = sc.nextInt();
		
		c= a.pow(b);
		System.out.println(c.remainder(BigInteger.valueOf(10)));
		sc.close();

	}

}
