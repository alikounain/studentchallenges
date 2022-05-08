package multithreading;

class ATM {
	synchronized public void checkBalance(String name) {
		System.out.print(name+" checking ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Balance");
	}
	
	synchronized public void withdraw(String name,int amount) {
		System.out.print(name+" withdrawing ");
		try{Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(amount);
	}
}

class Customer extends Thread {
	String name;
	int amount;
	ATM atm;
	
	Customer(String n,ATM a,int amt){
		name=n;
		atm=a;
		amount=amt;
	}
	public void useAtm() {
		atm.checkBalance(name);
		atm.withdraw(name, amount);
	}
	public void run() {
		useAtm();
	}
}

public class Bank {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Customer c1 = new Customer("Smith",atm,1000);
		Customer c2 = new Customer("john",atm,2000);
		c1.start();
		c2.start();
	}
}

