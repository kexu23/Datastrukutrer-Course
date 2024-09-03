import static org.junit.Assert.*;
import org.junit.Test;

public class SortedLinkedListTest {
	@Test
	public void testSortedLinkedList() {
		/*
		 * Tests if elements added to the list appear in order
		 */
		System.out.println("=== testSortedLinkedList ===");
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		list.add(5);
		list.add(1);
		list.add(-2);
		list.add(7);
		list.add(3);
		
		list.reset();
		int i = 0;
		int curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("c was not found on position " + i++, curr == -2);
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("b was not found on position " + i++, curr == 1);
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr == 3);
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr == 5);
		
		list.succ();
		curr = list.retrieveCurr();
		System.out.println("Position " + i + " = " + curr);
		assertTrue("a was not found on position " + i++, curr == 7);
		
		list.succ();
		assertTrue("All elements should have been traversed", list.endOfList());
	}
}
