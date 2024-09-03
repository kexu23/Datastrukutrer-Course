import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTestRemove {

	@Test
	public void testRemove() {
		/*
		 * Tests if it works to remove an element from a list
		 */
		System.out.println("\n=== testRemove ===");
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		boolean ret = list.remove("b");
		assertTrue("remove should return true, since b was in the list", ret);
		ret = list.remove("d");
		assertFalse("remove should return false, since d was not in the list", ret);

		// We should now have the list [c, b, a]
		
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
		assertTrue("endOfList should return true", list.endOfList());
	}
	
	@Test
	public void testRemoveFirst() {
		/*
		 * Tests if remove works on an element that is first in the list
		 */
		System.out.println("\n=== testRemoveFirst ===");
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		boolean ret = list.remove("c");
		assertTrue("remove should return true, since c was in the list", ret);

		// We should now have the list [b, a]
		
		int i = 0;
		list.reset();
		String curr = list.retrieveCurr();
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
	public void testRemoveLast() {
		/*
		 * Tests if remove works on an element that is last in the list
		 */
		System.out.println("\n=== testRemoveLast ===");
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		boolean ret = list.remove("a");
		assertTrue("remove should return true, since a was in the list", ret);

		// We should now have the list [c, b]
		
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
		assertTrue("endOfList should return true", list.endOfList());
	}
	
	@Test
	public void testRemoveOnEmptyList() {
		/*
		 * Tests if remove returns false when trying to remove an element from
		 * an empty list
		 */
		System.out.println("\n=== testRemoveOnEmptyList ===");
		LinkedList<String> list = new LinkedList<String>();
		boolean ret = list.remove("a");
		assertFalse("remove should return false, since a was not in the list", ret);
		assertTrue("endOfList should return true", list.endOfList());
	}

}
