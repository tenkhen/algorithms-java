package algo.selectionsort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int[] sortedArray = selectionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
		System.out.println(Arrays.toString(sortedArray));
		
	}

	/*
	 * Procedure: SELECTION-SORT(A)
	 * 
	 * Inputs:
	 * 		A: an array to be sorted
	 * 
	 * Output:
	 * 		A sorted in ascending order
	 * 
	 * 1. for i = 0 to A.length -1;
	 * 		a. Set minimum to i
	 * 		b. for j = i + 1 to A.length:
	 * 			a. if A[j] < A[minimum]
	 * 				i. then set minimum to j
	 *		c. Swap A[i] with A[minimum]
	 */
	public static int [] selectionSort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int minimum = i;
			
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] < a[minimum]) minimum = j;
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;
	}
}
