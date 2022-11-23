package Model;

public class QNode<Type> {
	
	// Data to be inserted into Node
	private Type data;
	
	// Node to be set next
	private QNode next;
	
	/**
	 * Default constructor that makes a new node containing data
	 * @param Data to be put into the node
	 */
	public QNode(Type data) {
		this.data = data;
		this.next = null;
	}

	/**
	 * Gets the data from node
	 * @return Data in the node
	 */
	public Type getData() {
		return data;
	}
	
	/**
	 * Sets the data in the node
	 * @param Data to be replaced
	 */
	public void setData(Type data) {
		this.data = data;
	}
	
	/**
	 * Gets the next node in the Queue
	 * @return The next node 
	 */
	public QNode<Type> getNext() {
		return next;
	}

	/**
	 * Sets the next node in the Queue
	 * @param Node to be set next 
	 */
	public void setNext(QNode<Type> next) {
		this.next = next;
	}
}
