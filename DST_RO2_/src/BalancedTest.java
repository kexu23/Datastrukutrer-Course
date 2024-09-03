import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedTest {

	@Test
	public void testSingles() {
		assertTrue(Balanced.isBalanced("()"));
		assertTrue(Balanced.isBalanced("[]"));
		assertTrue(Balanced.isBalanced("{}"));
		
		assertFalse(Balanced.isBalanced("("));
		assertFalse(Balanced.isBalanced("["));
		assertFalse(Balanced.isBalanced("{"));
		assertFalse(Balanced.isBalanced(")"));
		assertFalse(Balanced.isBalanced("]"));
		assertFalse(Balanced.isBalanced("}"));
	}

	
	@Test
	public void testMultiples() {
		assertTrue(Balanced.isBalanced("([{}])"));
		assertTrue(Balanced.isBalanced("[({})]"));
		assertTrue(Balanced.isBalanced("{[()]}"));
		
		assertFalse(Balanced.isBalanced("([}])"));
		assertFalse(Balanced.isBalanced("[({}]"));
		assertFalse(Balanced.isBalanced("[()]}"));
	}
	
	@Test
	public void testAdvancedAndComplicated() {
		assertTrue(Balanced.isBalanced("([{}()[]({[]})])"));
		assertTrue(Balanced.isBalanced("{}()([{}()[]({[]})])"));
		
		assertFalse(Balanced.isBalanced("([{}()[]({[]}))"));
		assertFalse(Balanced.isBalanced("{}()([}()]({[]})])"));
	}
	
}
