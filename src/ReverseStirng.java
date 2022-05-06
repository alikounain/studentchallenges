import java.util.Scanner;
public class ReverseStirng {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sting");
		String str = sc.nextLine();
		
//		METHOD-1
//		StringBuilder sb = new StringBuilder(str);
//		String rev = sb.reverse().toString();
//		if (rev.equals(str)) {
//			System.out.println("palidrome");
//		}
//		else
//			System.out.println("not palindrome");

//		METHOD-2
//		char ch[] = str.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
		
		for (int i=(str.length()-1);i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		sc.close();
		}

}
