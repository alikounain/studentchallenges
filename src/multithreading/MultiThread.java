package multithreading;

public class MultiThread extends Thread {
	
	public void run() {
		int i=1;
		while (true) {
			System.out.println(i+" hello");
			i++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultiThread m = new MultiThread();
		m.start();
		
		int i=1;
		while(true) {
			System.out.println(i+" world");
			i++;
		}
	}

}
