package com.dkhan;

public class SimpleQ {
	private int []array;
	private int front, rear;
	
	public SimpleQ() {
		array = new int[3];
		front = rear = -1;		//empty Q
	}
	
	public void enqueue(int item) throws OverFlowException {
		if(rear == array.length-1) {
			throw new OverFlowException();
		}
		else {
			front = 0;
			array[++rear] = item;
		}
	}
	public int dequeue() throws UnderFlowException {
		if(front == -1) {
			throw new UnderFlowException();
		}
		else {
			int item = array[front];		//item at front is copied
			for(int i=front; i<rear; i++) {	//remaining all items shifted towards 'front-end'
				array[i] = array[i+1];
		}
		rear--;
		if(rear == -1) front = -1;			//if Q has only one item & that is being removed
		return item;
		}
	}
}
