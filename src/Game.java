import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count=1;
		System.out.println("Press any number between 0 to 999");
		System.out.print(count+".");
		int no = sc.nextInt();
		int random = (int) (Math.random()*1000);
		
		while(no!=random && no!=786786) {
			System.out.println();
			if(no>random)
				System.out.println(":( Type lower than "+no+" try again");
			else
				System.out.println(":( Type higher than "+no+" try again");
			
			count++;
			System.out.print(count+".");
			no = sc.nextInt();
		}
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("Congratulation :) You won.... Number is "+random);
		System.out.println("Your total attempt is "+count);
		sc.close();

	}

}
