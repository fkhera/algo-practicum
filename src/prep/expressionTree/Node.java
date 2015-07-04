package prep.expressionTree;

//In order for a class to have abstract methods, it's type must be abstract

public abstract class Node {
	
	Node left;  //recursive left definition
	Node right; //recursive right definition
	
	public abstract int eval();

}
