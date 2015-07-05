package book.epi.chapter9;

import java.util.Stack;

public class TwoStackQueue {
	
	private Stack<Integer> A;
	private Stack<Integer> B;
	
	public TwoStackQueue()
	{
		A = new Stack<Integer>();
		B = new Stack<Integer>();
	}
	
	//The enqueue is pretty straight forward
	public void enqueue(int num)
	{
		A.push(num);
	}
	
	public int dequeue()
	{
		int numToReturn = 0;
		
		//Do a copy of whole stack of A onto B, if B is empty
		if(B.isEmpty())
		{
			while(!A.isEmpty())
			{
				B.push(A.pop());
			}
		}
	
		if(!B.isEmpty())
		{
			numToReturn = B.pop();
		}
	
		return numToReturn;
	}
	
}
