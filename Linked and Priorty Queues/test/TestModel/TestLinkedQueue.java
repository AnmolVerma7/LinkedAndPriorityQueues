package TestModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.LinkedQueue;

class TestLinkedQueue {
	
	//LinkedListQueue Object
	private LinkedQueue<String> LQ;

	/**
	 * Initializes a LinkedQueue before each test
	 */
	@BeforeEach
	public void init () {
		LQ = new LinkedQueue<>();
	}
	
	/**
	 * Tests if item as been added to LinkedQueue
	 */
	@Test
	public void testEnqueue() {
		String word = "Added to Queue";
		LQ.enqueue(word);
		String expectedWord = LQ.peek();
		assertEquals(word, expectedWord, "Equals");
	}
	
	/**
	 * Removes item from LinkedQueue
	 * @throws Exception if Queue is empty
	 */
	@Test
	public void testDequeue() throws Exception {
		String testString = "Remove and return from LinkedQueue";
		
		LQ.enqueue(testString);
		String dequeueString = LQ.dequeue();
		
		assertEquals(dequeueString, testString, "Equals" );
	}

	/**
	 * Tests the peek method of the LinkedQueue
	 */
	@Test
	void testPeek() {
		String testString = "Return but not remove";
		LQ.enqueue(testString);
		assertEquals(testString, LQ.peek(), "Equals");
		
	}
	
	/**
	 * Tests if Queue returns size when items are inserted
	 */
	@Test
	void testGetSize() {
		LQ.enqueue("First");
		LQ.enqueue("Second");
		LQ.enqueue("Third");
		LQ.enqueue("Fourth");
		LQ.enqueue("Fifth");
		
		int sizeOfQueue = LQ.getSize();
		
		assertEquals(sizeOfQueue, 5 , "Equals");
	}
		
}
