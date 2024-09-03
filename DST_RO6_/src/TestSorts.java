import static org.junit.Assert.*;
import org.junit.Test;

public class TestSorts {

	@Test
	public void testQuickSort() {
		/*
		 * This test only tests that the sorting algorithm
		 * is working. It does not test if medianOfThree is working
		 * correctly
		 */
		int[] a  = {-1,5,3,-2,0,27,5,5,4,8,3};
		Sorts.quickSort(a);
		assertTrue(isSorted(a));
		
		int[] b = {1,2,3,4};
		Sorts.quickSort(b);
		assertTrue(isSorted(b));
		
		int[] c = {};
		Sorts.quickSort(c);
		assertTrue(isSorted(c));
		
		int[] d = {4,3,2,1,0};
		Sorts.quickSort(d);
		assertTrue(isSorted(d));
	}
	
	
	@Test
	public void testMedianOfThree1() {
		int[] a = {1,2,3};
		assertEquals(1, Sorts.medianOfThree(a, 0, a.length-1));	
	}
	
	@Test
	public void testMedianOfThree2() {
		int[] a = {4,3,2,1,0};
		assertEquals(2, Sorts.medianOfThree(a, 0, a.length-1));
	}
	
	@Test
	public void testMedianOfThree3() {
		int[] a  = {-1,5,3,-2,0,27,5,5,4,8,3};
		assertEquals(10, Sorts.medianOfThree(a, 0, a.length-1));
	}
	
	private static boolean isSorted(int[] array) {
		// Returns true if the array values are sorted and false otherwise.
		boolean sorted = true;
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i + 1]) {
				sorted = false;
			}
		}
		return sorted;
	}
	
}
