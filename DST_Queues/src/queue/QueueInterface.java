package queue;

public interface QueueInterface<T> {
	
	public void enqueue(T item);
	// Effect: Adds item to the rear of the queue
	// Precondition: The queue is not full
	// Postcondition: item is at the rear of the queue
	
	public T dequeue();
	// Effect: Removes front element from the queue and returns it
	// Precondition: The queue is not empty
	// Postcondition: Front element has been removed from the queue
	// 				  Return value = (the removed element)
	
	public boolean isEmpty();
	// Effect: Determines if the queue is empty
	// Postcondition: Return value = (this queue is empty)
	
	public boolean isFull();
	// Effect: Determines if the queue is full
	// Postcondition: Return value = (this queue is full)
}
	
	