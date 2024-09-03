

public interface DequeInterface<T> {

	public void addFront(T x); // adds the element x to the front of the deque
	public void addRear(T x);  // adds the element x to the rear of the deque
	public T removeFront() throws QueueUnderflowException;    // removes front element from the deque
	public T removeRear() throws QueueUnderflowException;     // removes rear element from the deque
	public boolean isFull();   // returns true if the deque is full, otherwise false
	public boolean isEmpty();  // returns true if the deque is empty, otherwise false
	public T front() throws QueueUnderflowException;          // returns the front element without removing it
	public T rear() throws QueueUnderflowException;           // returns the rear element without removing it
	
}
