package algo.mergesort;

public class MergeSort {

	public void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length -1);
	}
	
	public void sort(int[] inputArray, int start, int end) {
		if(end <= start) return;
		
		int mid = (start + end) /2;
		sort(inputArray, start, mid);
		sort(inputArray, mid + 1, end);
		merge(inputArray, start, mid, end);
	}
	
	public void merge(int[] inputArray, int start, int mid, int end) {
		
		int[] tempArray = new int [end - start +1]; // end is length -1 (e.g. 5), end - start is 5 and +1 = 6; 
		
		// index counter for the left side of the array
		int leftSlot = start;
		// index counter for the right side of the array
		int rightSlot = mid+1;
		// k is index position to be used for tempArray to assign the value after comparing
		int k = 0; 
		
		// one of the leftSlot exceeds mid or rightSlot exceeds end, loop ends
		while(leftSlot <= mid && rightSlot <= end) {
			if(inputArray[leftSlot] < inputArray[rightSlot]) {
				// if left value is lower than right value, it store to tempArray
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				// otherwise right value store to tempArray
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		
		/**
		 * when it gets to here, that means the above loop has completed.
		 * So both the right and the left side of the sub-array can be considered sorted.
		 * Considered meaning, when we sort in above while loop, either leftSlot or rightSlot
		 * might not incremented to max as either leftSlot exceeds mid or rightSlot exceeds end, loop terminates.
		 * In that case, tempArray is not fully filled with values. In order to make sure of it, we need to do following:
		 */
		
		if(leftSlot <= mid) { // meaning right side is sorted
			while(leftSlot <= mid) {
				// we store left over from left side to tempArray
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if(rightSlot <= end) { // meaning left side is sorted
			while(rightSlot <= end) {
				// we store left over from right side to tempArray
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		// copy over the tempArray into the appropriate slots of the inputArray
		for(int i = 0; i < tempArray.length; i++) {
			inputArray[start+i] = tempArray[i];
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
