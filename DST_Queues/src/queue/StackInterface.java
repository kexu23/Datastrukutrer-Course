package queue;

/* StackInterface.java

Interface for a class that implements a stack of Objects.
A stack is a last-in, first-out structure.
*/

public interface StackInterface<T> {

	public void push(T item) throws StackOverFlowException;
	/* Effect: Adds item to the top of this stack
	   Postcondition: If this stack is full an exception is thrown,  
	                  else item is at the top of this stack
	*/

	public void pop() throws StackUnderFlowException;
	/* Effect: Removes top item from this stack
	   Postcondition: If this stack is empty an exception is thrown,  
	                  else top element has been removed from this stack
	*/
	
	public T top() throws StackUnderFlowException;
	/* Effect: Returns a reference tp the element on top of this stack
	   Postcondition: If this stack is empty an exception is thrown, 
	                  else return value = top element of the stack
	*/
	
	public boolean isEmpty();
	/* Effect: Determines whether this stack is empty
	   Postcondition: Return value = this stack is empty
	*/
	
	public boolean isFull();
	/* Effect: Determines whether this stack is full
	   Postcondition: Return value = this stack is full
	*/
}
