package stack;

@SuppressWarnings("serial")
public class OverFlowException extends Exception {

	@Override
	public String toString()	//member of "object class"
	{
		return "STACK FULL";
	}
}
