package Interface;

public class Customer implements Member {

	String name;
	
	Customer(String n) {
		this.name=n;
	}
	
	@Override
	public void callback() {
		System.out.println("OK, I will visit,"+name);
		
	}
}
