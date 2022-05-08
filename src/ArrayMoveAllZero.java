import java.util.Arrays;

public class ArrayMoveAllZero {

	public static void main(String args[]) {
		int arr[]= {1,2,0,0,3,4,0,5};
		int c=0;
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr[c++]=arr[i];
			}
		}
		while(c<arr.length) {
			arr[c++]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}


