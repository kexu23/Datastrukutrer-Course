package queue;

public class LinkedQueue<T> implements QueueInterface<T> {
	
	private class Node {
	// Used to hold references to nodes for the linked queue implementation
		private T info;
		private Node link;
	}
	
	private Node front;
	private Node rear;
	
	// Constructor
	public LinkedQueue() {
		front = null;
		rear = null;
	}
	
	public void enqueue(T item) {
	// Adds element at the rear of the queue
    	Node newNode = new Node();
    	newNode.info = item;
    	newNode.link = null;
    	if (rear == null) {
    		// If we are inserting into an empty queue
    		front = newNode;
    	}
    	else {
    		rear.link = newNode;
    	}
    	rear = newNode;
	}
	
	public T dequeue() {
	// Throws QueueUnderflowException if the queue is empty,
	// otherwise removes an element from the front of the queue
		if (!isEmpty()) {
			T toReturn = front.info;
			front = front.link;
			if (front == null) {
				rear = null;
			}
			return toReturn;
		}
		else {
				throw new QueueUnderflowException("Dequeue attempted on empty queue!");
		}
	}	
	
	public boolean isEmpty() {
	// Checks if queue is empty
		return (rear == null);
	}
	
	public boolean isFull() {
	// Checks if queue is full
		return false;
	}	
}	