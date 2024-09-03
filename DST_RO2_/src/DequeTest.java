import static org.junit.Assert.*;

import org.junit.Test;

public class DequeTest {

	DequeInterface<String> deque;
	
	/*
	 * Gör inte förändringar i den här klassen!!
	 * 
	 * Denna klass kan exekveras som en vanlig klass med en 
	 * main metod, fastän denna klass inte innehåller en 
	 * sådan. När man gör det, exekveras alla JUnit test
	 */
	
	@Test
	public void testAddFront() {
		deque = new Deque<>();
		
		String a = "a";
		String b = "b";
		
		deque.addFront(a);
		assertTrue(deque.front().contentEquals("a"));
		
		deque.addFront(b);
		assertTrue(deque.front().contentEquals("b"));
		
	}

	@Test
	public void testAddRear() {
		deque = new Deque<>();
		
		String a = "a";
		String b = "b";
		
		deque.addRear(a);
		assertTrue(deque.rear().contentEquals("a"));
		
		deque.addRear(b);
		assertTrue(deque.rear().contentEquals("b"));
		
	}
	
	@Test
	public void testRemoveFront() throws QueueUnderflowException {
		deque = new Deque<>();
		String a = "a";
		String b = "b";
		
		deque.addFront(a);
		deque.addFront(b);

		deque.removeFront();
		assertTrue(deque.front().contentEquals("a"));
		
		deque.removeFront();
		assertTrue(deque.isEmpty());
	}
	
	@Test
	public void testRemoveRear() throws QueueUnderflowException {
		deque = new Deque<>();
		String a = "a";
		String b = "b";
		
		deque.addRear(a);
		deque.addRear(b);
		
		deque.removeRear();
		assertTrue(deque.rear().contentEquals("a"));
		
		deque.removeRear();
		assertTrue(deque.isEmpty());
		
	}
	
	@Test
	public void testAddRemoveFrontAndRear() throws QueueUnderflowException {
		deque = new Deque<>();
		String []data = {"a", "b", "c", "d", "e", "f"};
				
		deque.addFront(data[0]);
		deque.addFront(data[1]);
		deque.addFront(data[2]);
		deque.addRear(data[3]);
		deque.addRear(data[4]);
		deque.addRear(data[5]);
				
		// Test removeFront
		assertTrue(deque.front().contentEquals("c"));
		deque.removeFront();
		
		assertTrue(deque.front().contentEquals("b"));
		deque.removeFront();
		
		assertTrue(deque.front().contentEquals("a"));
		deque.removeFront();
		
		assertTrue(deque.front().contentEquals("d"));
		deque.removeFront();
		
		assertTrue(deque.front().contentEquals("e"));
		deque.removeFront();
		
		assertTrue(deque.front().contentEquals("f"));
		deque.removeFront();
		
		assertTrue(deque.isEmpty());
		
		deque.addRear(data[0]);
		deque.addRear(data[1]);
		deque.addRear(data[2]);
		deque.addFront(data[3]);
		deque.addFront(data[4]);
		deque.addFront(data[5]);
		
		// Test removeRear
		
		assertTrue(deque.rear().contentEquals("c"));
		deque.removeRear();
		
		assertTrue(deque.rear().contentEquals("b"));
		deque.removeRear();
		
		assertTrue(deque.rear().contentEquals("a"));
		deque.removeRear();
		
		assertTrue(deque.rear().contentEquals("d"));
		deque.removeRear();
		
		assertTrue(deque.rear().contentEquals("e"));
		deque.removeRear();
		
		assertTrue(deque.rear().contentEquals("f"));
		deque.removeRear();
		
		assertTrue(deque.isEmpty());
	}

}
