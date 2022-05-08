
public class StringCount {
	
	public static  void main(String args[]) {
		String s="Count number of string";
		int count=0;

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ')
				count++;
		}
		System.out.println("total string count is : "+count);
	}
}