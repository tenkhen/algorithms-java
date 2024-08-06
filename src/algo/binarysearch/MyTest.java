package algo.binarysearch;

public class MyTest {

	public static void main(String[] args) {

		int[] arr = {1, 15, 23, 43, 50, 65, 73, 81, 92, 134, 159};
		
		int result = binarySearch(arr, 23);
		System.out.println(result);

	}

	public static int binarySearch(int[] a, int x) {
		
		int p = 0;
		int r = a.length -1;
		
		while(p <= r) {
			int q = (p + r) / 2;
			
			if(a[q] > x) r = q -1;
			else if(a[q] < x) p = q +1;
			else return q;
		}
		return -1;
	}
}
