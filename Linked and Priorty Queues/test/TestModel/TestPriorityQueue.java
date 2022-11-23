package TestModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.PriorityQueue;

class TestPriorityQueue {

	//LinkedListQueue Object
	private PriorityQueue<String> PQ;

	/**
	 * Initializes a PriorityQueue before each test
	 */
	@BeforeEach
	public void init () {
		PQ = new PriorityQueue<>();
	}
	
	/**
	 * Tests if item as been added to PriorityQueue
	 */
	@Test
	public void testEnqueue() {
		String word = "Added to Queue";
		PQ.enqueue(word);
		String expectedWord = PQ.peek();
		assertEquals(word, expectedWord, "Equals");
	}

	/**
	 * Removes item from PriorityQueue
	 * @throws Exception if Queue is empty
	 */
	@Test
	public void testDequeue() throws Exception {
		String testString = "Remove and return from LinkedQueue";
		
		PQ.enqueue(testString);
		String dequeueString = PQ.dequeue();
		
		assertEquals(dequeueString, testString, "Equals" );
	}

	
	/**
	 * Tests the peek method of the PriorityQueue
	 */
	@Test
	void testPeek() {
		String testString = "Return but not remove";
		PQ.enqueue(testString);
		assertEquals(testString, PQ.peek(), "Equals");
		
	}

	/**
	 * Tests if Queue returns size when items are inserted
	 */
	@Test
	void testGetSize() {
		PQ.enqueue("First");
		PQ.enqueue("Second");
		PQ.enqueue("Third");
		PQ.enqueue("Fourth");
		PQ.enqueue("Fifth");
		
		int sizeOfQueue = PQ.getSize();
		
		assertEquals(sizeOfQueue, 5 , "Equals");
	}

}
