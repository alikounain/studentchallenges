package com.dkhan;

import com.dkhan.OverFlowException;
import com.dkhan.UnderFlowException;

public class Main {

	public static void main(String[] args) {
		CircularQ s= new CircularQ();
		//SimpleQ s=new SimpleQ();
		int item;
		try {
			s.enqueue(10);
			s.enqueue(20);
			//s.enqueue(30);
			
			item = s.dequeue();
			System.out.println("Deleted Item = "+ item);
			System.out.println("Deleted Item = "+ s.dequeue());
			
			item = s.dequeue();
			System.out.println("Success");
		}
		catch (OverFlowException | UnderFlowException e) {
			System.out.println(e);
		}
	
		finally {
			System.out.println("OVER");
		}
	}

}
