package queue;

public class CircularQ {

	private int []array;
	private int front, rear;
	
	public CircularQ() {
		array = new int[3];
		front = rear = -1;		//empty Q
	}
	
	public void enqueue(int item) throws OverFlowException {
		int bi = (front == 0) ? array.length-1 : front -1;
		if(bi == rear) {
			throw new OverFlowException();
		}
		else {
			if(front == -1) front = 0;
			array[++rear] = item;
		}
		
	}
	public int dequeue() throws UnderFlowException {
		if(front == -1) {
			throw new UnderFlowException();
		}
		else {
			int item = array[front];	//item at front is copied
			
			if(front == rear) {			//case1 : is CQ has single item	
				front = rear = -1;
			}
			else {	//case2 : CQ has more than one item
				
		//_______Methods for advance front________	
				//method 1
				//front++;
				//if(front == array.length) front =0;	//checking if front is at array.lenth			
				
				//method 2
				//if (front == array.length-1) front = -1;
				//front++;
				
				//method 3
				front = (front == array.length-1) ? 0 : front +1;
			}
			return item;
		}		
	}
}