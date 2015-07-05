package test.book.epi.chapter9;

import static org.junit.Assert.*;

import org.junit.Test;

import book.epi.chapter9.TwoStackQueue;

public class TestChapter9 {

	@Test
	public void test() {
		TwoStackQueue queue = new TwoStackQueue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		int num1 = queue.dequeue();
		int num2 = queue.dequeue();
		
		assertEquals(num1, 1);
		assertEquals(num2, 2);
	}

}
