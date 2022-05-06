package multithreading;

class Mythread extends Thread{
	
	Mythread(String name) {
		super(name);
	}
	public void run() {
		int count=1;
		while(true) {
			System.out.println(count++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Sleep {

	public static void main(String[] args) {
		Mythread t = new Mythread("Thread-1");
		t.start();
		t.interrupt();
	}

}
