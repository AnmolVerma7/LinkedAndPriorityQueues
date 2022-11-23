package Model;

public interface QueueInterface<Type> {
	
	/**
	 * Add data to Queue
	 * @param data to be inserted in Queue
	 */
	public void enqueue(Type data);
	
	/**
	 * Remove data from front of Queue
	 * @return Removed data from front of Queue
	 * @throws Exception
	 */
	public Type dequeue() throws Exception;
	
	/**
	 * Get element in front of Queue
	 * @return
	 */
	public Type peek();
	
	/**
	 * Get the size of Queue
	 * @return integer value of Queue size
	 */
	public int getSize();
	
	/**
	 * Boolean method to tell if Queue is empty
	 * @return True if empty, false if not empty
	 */
	public boolean isEmpty();
	
	/**
	 * Print Queue
	 * @throws Exception
	 */
	public void printQueue() throws Exception;
}
	