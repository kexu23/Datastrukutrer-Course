package queue;

import java.lang.reflect.Array;


/* ArrayStack

Array implementation of the StackInterface.
*/

public class ArrayStack<T> implements StackInterface<T> {

	static final int DEFAULT_CAPACITY = 100; 	// default capacity
	private T[] stack;         			// holds stack elements
	private int topIndex;      				// index of top element in stack
	
	// Constructors
	public ArrayStack() {
	  //Don't construct arrays like this.
	  stack = (T[])new Object[DEFAULT_CAPACITY];
	  topIndex = -1;
	}
	
	public ArrayStack(int maxSize) {
	  //... or like this.
	  stack = (T[])new Object[maxSize];
	  topIndex = -1;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(Class<? extends T> clazz, int maxSize) {
		//Construct arrays like this. This creates an array of type T[].
		//Note still need to suppress the
		//warning about possible type safety violations due to the 
		//signature of Array.newInstance. The signature is like it is
		//to preserve backwards compatibility.
		stack = (T[])Array.newInstance(clazz,maxSize);
		topIndex = -1;
	}

  	public void push(T item) throws StackOverFlowException {
	/* Effect: Adds item to the top of this stack
	   Postcondition: If this stack is full an exception is thrown,  
	                  else item is at the top of this stack
	*/
		if (!isFull()) {
      		topIndex++;
     		 stack[topIndex] = item;
    	}
	    else {
	      throw new StackOverFlowException("Push attempted on a full stack.");
	    }
	}	

	public void pop() throws StackUnderFlowException {
	/* Effect: Removes top item from this stack
	   Postcondition: If this stack is empty an exception is thrown,  
	                  else top element has been removed from this stack
	*/
		if (!isEmpty()) {
	      stack[topIndex] = null;
	      topIndex--;
	    }
	    else {
	      throw new StackUnderFlowException("Pop attempted on an empty stack.");
	    }
	  }
	
	public T top() throws StackUnderFlowException {
	/* Effect: Returns a reference tp the element on top of this stack
	   Postcondition: If this stack is empty an exception is thrown, 
	                  else return value = top element of the stack
	*/
		T topOfStack = null;
	    if (!isEmpty()) {
	      topOfStack = stack[topIndex];
	    }
	    else {
	      throw new StackUnderFlowException("Top attempted on an empty stack.");
	    }
	    return topOfStack;
	  }
	
	public boolean isEmpty() {
	/* Effect: Determines whether this stack is empty
	   Postcondition: Return value = this stack is empty
	*/
		
		return (topIndex == -1);
  	}
	
	public boolean isFull() {
	/* Effect: Determines whether this stack is full
	   Postcondition: Return value = this stack is full
	*/
		return (topIndex == (stack.length - 1));
	}
	
	public T[] getArray(){
		/*
		 * Effect: Returns the internal array. The point is here to illustrate 
		 * how easy it is to do the wrong thing with generics and arrays.
		 */
		return stack;
	}
}
