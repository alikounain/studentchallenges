
public class ReverseAString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "reverse this string";
		String arr[]=str.split(" ");
		for (String x:arr)
			System.out.print(x+" ");
		System.out.println();
		
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
