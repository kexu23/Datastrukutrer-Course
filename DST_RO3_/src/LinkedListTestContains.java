import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTestContains {

	@Test
	public void testContains() {
		/*
		 * Tests the contains method, when the element is in the list and when 
		 * it is not
		 */
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		assertTrue("contains(\"a\") should return true",list.contains("a"));
		assertTrue("contains(\"b\") should return true", list.contains("b"));
		assertTrue("contains(\"c\") should return true", list.contains("c"));
		
		assertFalse("contains(\"d\") should return false", list.contains("d"));
	}
	
	@Test
	public void testContainsOnEmptyList() {
		/*
		 * Tests contains on an empty list
		 */
		LinkedList<String> list = new LinkedList<String>();
		assertFalse("contains on empty list should return false", list.contains("a"));
	}

}
