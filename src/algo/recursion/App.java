package algo.recursion;

public class App {

	public static void main(String[] args) {
		
		reduceByOne(10);

	}
	
	public static void reduceByOne(int n) {
		
		// this if statement is called BASE CASE to end the recursive method
		if(n >= 0) {
			reduceByOne(n-1);
		}

		System.out.print(n + " ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
