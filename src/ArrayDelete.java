import java.util.Arrays;


public class ArrayDelete {

	public static void main(String[] args) {
		int[] arr= {55,45,321,25,2,22};
		int[] arr2=null;
		int delete=321;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==delete) {
				arr2=new int[arr.length-1];
				for(int j=0;j<i;j++) {
					arr2[j]=arr[j];
				}
				for(int k=i;k<arr.length-1;k++) {
					arr2[k]=arr[k+1];
				}
				break;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
