package algo.binarysearch;

public class App {
	/*
	 * Binary Search ONLY works with sorted array/list.
	 * If array/list is unsorted, we need to use linear search
	 * 
	 * It's called O(log n) Logarithmic Algorithm. Its scalable and super fast
	 * 
	 * Binary Search starts to compare the item at middle index. If the number of middle index
	 * is bigger than the number we are searching, then we can skip all the numbers above
	 * that middle index position. Then we divide by 2 and do the same thing. This approach
	 * is more efficient.
	 */
	public static void main(String[] args) {
		
		int[] arr = {2, 9, 12, 23, 31, 46, 57, 62, 70, 78, 89, 92};
		
//		int result = binarySearch(a, 90);
//		System.out.println(result);
		
		int result = recursiveBinarySearch(arr, 0, arr.length -1, 33);
		System.out.println(result);
	}
	
	/*
	 * PSEUDO-CODE
	 * 
	 * Procedure: BINARY-SEARCH(A,x)
	 * 
	 * Input and Output same as LINEAR-SEARCH
	 * 
	 * 1. Set p to 0, and set r to n
	 * 2. While p <= r, do the following:
	 * 		a. Set q to [ (p + r) /2 ]
	 * 		b. if A[q] = x, then return q.
	 * 		c. if A[q] > x, then set r to q - 1
	 * 		   else set p to q + 1
	 * 3. Return -1
	 */
	
	public static int binarySearch(int[] a, int x) {

		// starting index
		int p = 0;
		// ending index
		int r = a.length -1;
		
		while(p <= r) {
			// middle index (middle index always changes every iteration)
			int q = (p + r) / 2;
			
			// if the number at the middle index position is equal to
			// searching number, return same index position
			if(a[q] == x) return q;
			// if the number at the middle index is greater than the
			// searching number, we bring down the ending index to the middle. This way
			// we no longer need to check higher numbers
			if(a[q] > x) r = q - 1;
			// else which means the number at the middle index is smaller than the
			// searching number, we bring up the starting index to the middle. So we
			// no longer need to check smaller numbers
			else p = q + 1;
		}
		// if searching number is not in the list, we simply return -1
		return -1;
	}
	
	/*
	 * Above code into equation:
	 * c1, c2, c3(n), c4(n), c5(n), c6(n) c7(n) c8(n)
	 * equation = 2c + 6c(n) = O(n)
	 * 
	 */
	
	/*
	 * Procedure: RECURSIVE-BINARY-SEARCH(A, p, r, x)
	 * 
	 * Inputs: A and x are the same as linearSearch. p and r represent the
	 * 		   sub-array A[p ... r] under consideration
	 * 
	 * Outputs: Same as linearSearch
	 * 
	 * 1. If p > r, return -1
	 * 2. Else:
	 * 		a. Set q to [(p + r) / 2]
	 * 		b. If A[q] == x, then return q.
	 * 		c. Else if A[q] > x then return RECURSIVE-BINARY-SEARCH(A, p, q-1, x)
	 * 		d. Else return RECURSIVE-BINARY-SEARCH(A, q+1, r, x)
	 */
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		// display range
		System.out.println("[ " + p + "..." + r + " ]");
		// p starts with 0 and by the time when we narrow down, p will cross over r 
		// in certain point. Still if it cannot find the number then it will return -1
		if(p > r) return -1;
		else {
			int q = (p + r) / 2;
			if(a[q] == x) return q;
			if(a[q] > x) return recursiveBinarySearch(a, p, q - 1, x);
			else return recursiveBinarySearch(a, q + 1, r, x);
		}
	}
}
