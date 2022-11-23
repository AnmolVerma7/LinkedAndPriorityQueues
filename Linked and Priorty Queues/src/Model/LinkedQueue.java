package Model;

import java.util.NoSuchElementException;

/**
 * This generic Linked Queue class implements the generic Queue Interface
 * @author Anmol Verma
 * @param <Type> The generic type of object the Queue can store
 */
public class LinkedQueue<Type> implements QueueInterface<Type>{
	
	// Front of Queue pointer
	private QNode<Type> front;
	
	// Rear of Queue pointer
	private QNode<Type> rear;
	
	// Initial size of Queue of 0; keeps track of the size of Queue
	private int size;
	
	/**
	 * Default constructor for LinkedQueue 
	 */
	public LinkedQueue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	/**
	 * Adds data to Queue by creating a new node 
	 * and arranging the rear pointer. Also increasing size
	 */
	public void enqueue(Type data) {
	
		QNode<Type> newNode = new QNode<Type>(data);
		if (size == 0) {
			front = newNode;
			rear = front;
		}
		else {
			rear.setNext(newNode);
			rear = newNode;
		}
		size++;
	}
	
	/**
	 * Removes QNode from front of Queue and returns it
	 * @return Remove the first QNode from Queue
	 */
	public Type dequeue() throws Exception {
		Type temp;
		if (front == null ) {
			return null;
		}
		else {
			temp = front.getData();
			front = front.getNext();
			size--;
			return temp;
		}	
	}
	
	/**
	 * Returns data from front QNode
	 * @return The data from the front QNode
	 */
	public Type peek() {
		if (front == null) {
			throw new NoSuchElementException();
		}
		else 
			return front.getData();
	}
	
	/** 
	 * Gets the size of the LinkedQueue
	 * @return size of Queue
	 */
	public int getSize() {
		return size;
	}
	/**
	 * Determines whether Queue is empty 
	 * @return True if empty, false if not empty
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Prints the Queue from first to last
	 */
	public void printQueue() throws Exception{ 
		QNode<Type> current;
		current = front;
		System.out.println("");
		if (front == null) {
			System.out.println("Queue is Empty\n");
	        return; 
		}
		else if (front == rear) { 
	         System.out.print(current.getData() + " <- ");
	    } 
	    else {
	    	while(current != null) {
	    	System.out.print(current.getData() + " <- ");
	    	current = current.getNext();
	    	}
	     }
	    	 
	     System.out.print("END OF QUEUE \n\n");
	}
	
}
