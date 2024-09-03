package queue;

import java.lang.reflect.Array;


public class ArrayQueue<T> implements QueueInterface<T> {
	
	private T[] queue;
	private int numItems;
	private int front;
	private int rear;
	
	// Constructors
	@SuppressWarnings("unchecked")
	public ArrayQueue(Class<? extends T> clazz) {
		//See ArrayStack for an explanation of this strange way to create arrays
		queue  = (T[])Array.newInstance(clazz,100);
		numItems = 0;
		front = 0;
		rear = 0;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(Class<? extends T> clazz, int maxSize) {
		queue = (T[])Array.newInstance(clazz,maxSize);;
		numItems = 0;
		front = 0;
		rear = 0;	
	}
	
	public void enqueue(T item) {
	// Throws QueueOverflowException if the queue is full,
    // otherwise add element at the rear of the queue
    	if (!isFull()) {
			queue[rear] = item;
			rear = (rear + 1) % queue.length;
			numItems = numItems + 1;
		}
		else {
			throw new QueueOverflowException("Enqueue attempted on full queue!");
		}
	}
	
	public T dequeue() {
	// Throws QueueUnderflowException if the queue is empty,
	// otherwise removes an element from the front of the queue
		if (!isEmpty()) {
			T frontItem = queue[front];
			queue[front] = null;
			front = (front+1) % queue.length;
			numItems = numItems - 1;
			return frontItem;
		}
		else {
			throw new QueueUnderflowException("Dequeue attempted on empty queue!");
		}
	}
		
	
	public boolean isEmpty() {
	// Checks if queue is empty
		return (numItems == 0);
	}
	
	public boolean isFull() {
	// Checks if queue is full
		return (numItems == queue.length);
	}
}	
	