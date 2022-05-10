package com.dkhan;

public class OverFlowException extends Exception {

	@Override
	public String toString()	//member of "object class"
	{
		return "QUEUE FULL";
	}
}
