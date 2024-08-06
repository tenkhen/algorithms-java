package algo.linearsearch;

public class App {
	/*
	 * Linear Search is used when array/list is unsorted.
	 * 
	 * It's not scalable. Because when we search an item, it has to compare all the elements 
	 * until the one we are searching for. If we have a array/list of 1000 items and the item 
	 * we are searching for is 1000th, then it needs to compare 1000 times.
	 */
	public static void main(String[] args) {
		int[] arr = {2, 9, 12, 23, 31, 46, 57, 62, 70, 78, 89, 92};
		
//		int result = linearSearch(a, 43);
//		System.out.println(result);
		
		int result = recursiveLinearSearch(arr, 0, 46);
		System.out.println(result);
	}
	
	/*
	 * [PSEUDO-CODE]
	 * 
	 * Procedure: LINEAR-SEARCH(A,x)
	 * 
	 * Inputs:
	 * 		A: the array to search in
	 * 		x: the value we are searching for in a
	 * 
	 * Output:
	 * 		The index position where A[i] == x or -1 if not found
	 * 
	 * 
	 * 1. Set answer to -1
	 * 2. For each index i going from 1 to n, in order
	 * 		If A[i] = x, then set answer to the value of i
	 * 3. Return the value of answer as the output.
	 * 
	 * (below implementation is optimized version of this pseudo-code)
	 */
	
	public static int linearSearch(int[] a, int x) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) return i;
		}
		
		return -1;
	}
	
	/*
	 * Procedure: RECURSIVE_LINEAR-SEARCH(A, i, x)
	 * 
	 * Inputs: Same as linearSearch but with added parameter i.
	 * 
	 * Outputs: The index of an element matching x in the sub-array from A[i]
	 * 			Through A[i], or -1 if x is not found in the array
	 * 
	 * 1. If i > n, then return -1
	 * 2. Else if A[i] == x then return i
	 * 3. Else return RECURSIVE-LINEAR-SEARCH(A, i + 1, x)
	 */
	
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if(i > a.length - 1) return -1; // if evaluates to true, x was not found in the array
		else if(a[i] == x) return i;
		else return recursiveLinearSearch(a, i + 1, x);
	}
}
