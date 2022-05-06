package conditionalstatement;
import java.util.*;

public class FindGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter marks of first subject");
		int m1 = sc.nextInt();
		System.out.println("Enter marks of second subject");
		int m2 = sc.nextInt();
		System.out.println("Enter marks of third subject");
		int m3 = sc.nextInt();
		
		int total=m1+m2+m3;
		float avg = (float)(m1+m2+m3)/3;
		System.out.println("Total marks = "+total);
		System.out.println("Average marks = "+avg);
		
		if(avg>=70) {
			System.out.println("Your Grade is A");
		}
		else if (avg>=60 && avg<70) {
		System.out.println("Your Grade is B");
		}
		else if (avg>=50 && avg<60) {
		System.out.println("Your Grade is C");
		}
		else if (avg>=40 && avg<50) {
		System.out.println("Your Grade is D");
		}
		else if (avg<40) {
		System.out.println("Your Grade is F");
		}
		else {
			System.out.println("Invalid grade entered");
		}
		sc.close();
	}
}
