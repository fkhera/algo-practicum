package prep.expressionTree;

public class Main {
	
	public static void main(String [] args)
	{
	
		System.out.println("hello world");
		DigitNode leftDigit = new DigitNode(4);
		DigitNode rightDigit = new DigitNode(5);
		DigitNode thirdDigit = new DigitNode(10);
		DigitNode fourthDigit = new DigitNode(3);
		
		PlusNode plusRoot = new PlusNode(leftDigit, rightDigit);
		int result = plusRoot.eval();
		System.out.println("Result: " + result);
		PlusNode plusRootSecond = new PlusNode(plusRoot, thirdDigit);
		
		result = plusRootSecond.eval();
		System.out.println("Result 2: " + result);
		DivideNode divideNode = new DivideNode(plusRootSecond, fourthDigit);
		
		
		result = divideNode.eval();
		System.out.println("Result 3: " + result);
	}

}
