import java.util.Scanner;

public class Blank {

	public static void main(String[] args) {
		System.out.println("Enter any no 1-4");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			break;
		}
	}

}
