package Model;

import java.util.NoSuchElementException;

/**
 * This generic Priority Queue class implements the generic Queue Interface
 * @author Anmol Verma
 * @param <Type> The generic type of object the Queue can store
 */
public class PriorityQueue<Type> implements QueueInterface<Type> {
	
	// Initial size of Queue of 0; keeps track of the size of Queue
	private int size;
	
	// Front of Queue pointer
	private QNode<Type> front;
	
	// Rear of Queue pointer
	private QNode<Type> rear;
	
	/**
	 * Constructor that sets size, front and rear to 0 and null 
	 */
	public PriorityQueue() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	/**
	 * Adds a new node to the priority queue at a specific position based on alphabetical order. 
	 * Sorting was done by casting the data to a string value
	 * @param data holds the data of the node
	 */
	public void enqueue(Type data) {
		QNode<Type> nodeToAdd = new QNode<>(data);
		   
		   if(front == null) {
		       front = nodeToAdd;
		       rear = nodeToAdd;
		       this.size++;
		   }
		   else {
			   if(((String) front.getData()).compareTo((String) nodeToAdd.getData()) > 0) {
		    		nodeToAdd.setNext(front);
		        	front = nodeToAdd;
		        	this.size++;
		    	}
		    	else {  
		    		QNode<Type> current = front; 
		    		
		    		while(current.getNext() != null && ((String) current.getNext().getData()).compareTo((String) nodeToAdd.getData()) < 0) {
		    			current = current.getNext();
		    		}
		    			
		    		if(current.getNext() == null) {
		    			rear = nodeToAdd;
		    			current.setNext(nodeToAdd);
		    			this.size++;
		    		}
		    		else {
		    			nodeToAdd.setNext(current.getNext());
		    			current.setNext(nodeToAdd);
		    			this.size++;
		    		}
		    	}
		   }
	}
	
	/**
	 * Removes the front node from the priority queue
	 * @return the data from the node removed
	 */
	public Type dequeue() throws Exception {
		if (front == null)
			return null;
		this.size--;
		QNode<Type> temp = front;
		front = front.getNext();
		return (Type) temp.getData();
	}
	
	/**
	 * Shows the data from the front node in the priority queue
	 * @return Data from the from node of the priority queue
	 */
	public Type peek() {
		if (front == null) {
			throw new NoSuchElementException();
		}
		else {
			return front.getData();
		}	
	}
	
	/**
	 * Getter for the priority queue size
	 * @return Size value of the priority queue
	 */
	public int getSize() {
		return this.size;
	}
	
	/**
	 * Determines if the priority queue is empty 
	 * @return True if it is empty and False if it is not
	 */
	public boolean isEmpty() {
		return (this.size > 0);
	}
	
	/**
	 * Prints the queue in an easy to read format
	 */
	public void printQueue() throws Exception {
		QNode<Type> current;
		current = front;
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
	     System.out.print("END OF QUEUE\n\n");
	}
}
