
public class palindrome {
	public static void main(String[] args) {
		int a=184481,b=0,c=0;
		int temp=a;
		while(a>0) {
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		System.out.println(temp==c);
	}
}
