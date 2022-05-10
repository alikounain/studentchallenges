package com.dk;

public class UnderFlowException extends Exception {
	
	@Override
	public String toString()	//member of "object class"
	{
		return "EMPTY STACK";
	}
}
