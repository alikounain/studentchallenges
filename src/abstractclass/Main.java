package abstractclass;

public class Main {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.radius=5;
		System.out.println("Area of circle is "+c.area());
		System.out.println("Perimeter is circle is "+c.perimeter());
		
		Shape s=new Circle();
		s=c;
		System.out.println(s.area());
	}

}
