import java.util.Scanner;


public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter string to check palindrome");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev="";
		for (int i=(str.length()-1);i>=0;--i) {
			rev=rev+str.charAt(i);
//			System.out.print(str.charAt(i));
		}
		if (str.toLowerCase().equals(rev.toLowerCase()))
			System.out.println("is palidrome");
		else
			System.out.println("not a palindrome");
		
//		METHOD-2
//		int i=0,j=str.length()-1;
//		while(i<j) {
//			if(str.charAt(i) != str.charAt(j))
//				System.out.println("not palindrome");
//			else
//				System.out.println("palindrome");
//			i++;
//			j--;
//			break;
//		}
//		System.out.println(str.matches("ab"));
		sc.close();
	}
}
