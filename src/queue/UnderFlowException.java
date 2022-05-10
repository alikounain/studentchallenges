package queue;

@SuppressWarnings("serial")
public class UnderFlowException extends Exception {
	
	@Override
	public String toString()	//member of "object class"
	{
		return "Q EMPTY";
	}
}
