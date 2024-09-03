import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTestInsert {

	@Test
	public void testInsert() {
		/*
		 * Tests if it works to insert an element in the list
		 */
		System.out.println("\n=== testInsert ===");
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.insert("d", 1);
		
		// We should now have the list [c, d, b, a]
		
		int i = 0;
		list.reset();
		String curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("c was not found on position " + i++, curr.equals("c"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("d was not found on position " + i++, curr.equals("d"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("b was not found on position " + i++, curr.equals("b"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr.equals("a"));

		
	}
	
	@Test
	public void testInsertFirst() {
		/*
		 * Tests if it works to insert an element first in the list
		 */
		System.out.println("\n=== testInsertFirst ===");
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.insert("d", 0);
		
		// We should now have the list [d, c, b, a]
		
		int i = 0;
		list.reset();
		String curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("d was not found on position " + i++, curr.equals("d"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("c was not found on position " + i++, curr.equals("c"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("b was not found on position " + i++, curr.equals("b"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr.equals("a"));
		
		list.succ();
		assertTrue("endOfList should return true", list.endOfList());
	}

	
	@Test
	public void testInsertLast() {
		/*
		 * Tests if it works to insert an element last in the list
		 */
		System.out.println("\n=== testInsertLast ===");
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.insert("d", 3);
		
		// We should now have the list [c, b, a, d]
		
		int i = 0;
		list.reset();
		String curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("c was not found on position " + i++, curr.equals("c"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("b was not found on position " + i++, curr.equals("b"));
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr.equals("a"));
		
		list.succ();
		assertFalse("endOfList should return false", list.endOfList());
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("d was not found on position " + i++, curr.equals("d"));

		list.succ();
		assertTrue("endOfList should return true", list.endOfList());
	}
	
	@Test
	public void testInsertOnEmptyList() {
		/*
		 * Tests if it works to insert an element in an empty list
		 */
		System.out.println("\n=== testInsertOnEmptyList ===");
		LinkedList<String> list = new LinkedList<String>();
		list.insert("a", 0);
		
		// We should now have a list with a single element a
		
		int i = 0;
		list.reset();
		assertFalse("endOfList should return false", list.endOfList());
		String curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr.equals("a"));
		
		list.succ();
		assertTrue("endOfList should return true", list.endOfList());
	}

}
