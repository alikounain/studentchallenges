
public class min {

	public static void main(String[] args) {
		
		int arr[] = {12,62,51,2,04,55};
		int x = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (x>arr[i]) {
				x=arr[i];
			}
		}
		System.out.println(x);
	}

}
