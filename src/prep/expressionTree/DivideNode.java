package prep.expressionTree;

public class DivideNode extends Node {
	
	public DivideNode(Node left, Node right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int eval()
	{
		int left = 0;
		int right = 0; 
		
		if(this.left != null)
		{
			left = this.left.eval();
		}
		
		if(this.right != null)
		{
			right = this.right.eval();
		}
		
		return left / right;
		
	}

}
