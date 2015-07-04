package prep.expressionTree;

//We get Node left and right properties automagically

public class DigitNode extends Node {
	int data;
	
	public DigitNode(int data)
	{
		this.data = data;
	}

	@Override
	public int eval() {
		
		return data;
	}
	
	
}
