package algo.insertionsort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int[] sortedArray = insertionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
		System.out.println(Arrays.toString(sortedArray));
	}

	/*
	 * Procedure: INSERTION-SORT(A)
	 * 
	 * Inputs:
	 * 		A: an array to be sorted
	 * 
	 * Output:
	 * 		A sorted in ascending order
	 * 
	 * 1. for i = 1 to A.length - 1:
	 * 		a. Set element to A[i], and set j to i - 1
	 * 		b. While j >= 0 and A[j] > element:
	 * 			a. Set A[j+1] to A[j]
	 * 			b. Decrement j by 1
	 *		c. Set A[j + 1] to element
	 */
	
	public static int[] insertionSort(int[] a) {
		for(int i = 1; i < a.length; i++) {
			int element = a[i]; // element variable contains the data we intend on bringing over to the sorted area
			int j = i -1; // j variable points to the index position of the last value in the sorted area
			while(j >= 0 && a[j] > element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}
}
