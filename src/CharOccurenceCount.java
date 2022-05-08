import java.util.Scanner;

public class CharOccurenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int count;

		for(char i ='a'; i<='z'; i++) {
			count=0;
			for(int j=0; j<str.length(); j++ ) {	
				if(i == str.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("The frequency of "+ i + " is "+count+" times" );
			}
		}
		sc.close();
		
//		String str = "aabbc";
//		int count;
//		for(char a='a';a<'z';a++) {
//			count=0;
//			for(int i=0;i<str.length();i++) {
//				if(str.charAt(i)==a) {
//					count++;
//				}
//			}
//			if (count>0) {
//				System.out.println("occrance of "+a+"="+count);
//			}
//		}
	}
}
