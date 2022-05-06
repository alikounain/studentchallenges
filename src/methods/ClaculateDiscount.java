package methods;

public class ClaculateDiscount {
	
	static double discount (double ...d){
		double price=0;
		
		for(int i=0;i<d.length;i++)
			price = price + d[i];
		
		if (price<1000)
			return price*0.10;
		else if (price>=1000 && price<2000)
			return price*0.15;
		else
			return price*0.20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(discount(20,650,82,100,524));

	}

}
