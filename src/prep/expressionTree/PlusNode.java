package prep.expressionTree;

public class PlusNode extends Node {
	
	public PlusNode(Node left, Node right)
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
		System.out.println(left);
		
		if(this.right != null)
		{
			right = this.right.eval();
		}
		System.out.println(right); 
		
		System.out.println(" + ");
		
		return left + right;
		
	}

}
