import java.util.Random;

public class Sorts {

	private static void swap(int[] array, int index1, int index2) {
		// Precondition: index1 and index2 are >= 0 and < SIZE.
		//
		// Swaps the integers at locations index1 and index2 of the values array. 
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	/*
	 * This method should return the index of the element chosen
	 * according to the "median of three" approach
	 */

	public static int medianOfThree(int[] array, int first, int last) {
		int center = (first + last) / 2;

		if (array[first] > array[center])
			swap(array, first, center);

		if (array[first] > array[last])
			swap(array, first, last);

		if (array[center] > array[last])
			swap(array, center, last);

		swap(array, center, last);
		return array[last];
	}

	/////////////////////////////////////////////////////////////////
	//
	//  Quicksort
	//
	//  Should be updated to choose the pivot as "median of three"
	//

	private static int partition(int[] array, int first, int last) {
		
		// Use the median of three approach to find the index of the pivot element
		
		int pivotIndex = medianOfThree(array, first, last); 
		
		int pivot = array[pivotIndex];
		int saveF = first;
		boolean onCorrectSide;

		// Because of how the sorting algorithm is implemented, we need to swap the
		// pivot element with the element at index first
		
		swap(array,first,pivotIndex);
		
		first++;
		do {
			onCorrectSide = true;
			while (onCorrectSide) {           // move first toward last
				if (array[first] > pivot) {
					onCorrectSide = false;
				}
				else {
					first++;
					onCorrectSide = (first <= last);
				}
			}

			onCorrectSide = (first <= last);
			while (onCorrectSide) {         // move last toward first
				if (array[last] <= pivot) {
					onCorrectSide = false;
				}
				else {
					last--;
					onCorrectSide = (first <= last);
				}
			}

			if (first < last) {
				swap(array, first, last);
				first++;
				last--;
			}
		} while (first <= last);

		swap(array, saveF, last);
		return last;
	}

	private static void quickSort(int[] array, int first, int last) {
		if (first < last) {
			int splitPoint;

			splitPoint = partition(array, first, last);
			// values[first]..values[splitPoint - 1] <= pivot
			// values[splitPoint] = pivot
			// values[splitPoint + 1]..values[last] > pivot

			quickSort(array, first, splitPoint - 1);
			quickSort(array, splitPoint + 1, last);
		}
	}
	
	
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length-1);
	}
	
	public static void main(String [] args) {
		int [] numbers = new int[100];
		for(int i=0;i<100;i++) {
			Random r = new Random();
			numbers[i] = r.nextInt(100);
			System.out.println(numbers[i]);
		}
		
		quickSort(numbers);
		
		System.out.println("Sorted");
		for(int i=0;i<100;i++) {
			System.out.println(numbers[i]);
		}
	}
}
