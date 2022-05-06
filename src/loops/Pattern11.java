package loops;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if(i+j>5) 
					System.out.print("* ");

				else
					System.out.print("  ");
			}

			for(int k=2;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=4;j++) {
				if(j<=i) 
					System.out.print("  ");
				else
					System.out.print("* ");
			}

			for(int k=1;k<=5-i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

