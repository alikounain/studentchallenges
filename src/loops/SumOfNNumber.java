package loops;
import java.util.*;

public class SumOfNNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number of get sum");
		int n = sc.nextInt();
		int r=0;
		
		for (int i=1;i<=n;i++) {
			 
			System.out.println(r+" + "+i+" = "+(i+r));
			r = i+r;
		}
		sc.close();
	}
}
