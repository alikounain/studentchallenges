
public class ArraySearchElements {

	public static void main(String args[]) {

		int flag=0;
		int[] arr = {22,54,8,66,35,88};

		int search = 88;
		
		/*Perform search operation*/
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("Element "+search+" found at "+i+" position");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element "+search+" not found");
		}
	}
}