package lecture03.examples;

public class MultipleExceptions2 {
	public static void main(String args[]) {
		int array[] = {20, 20, 40};
		int num1 = 15, num2 = 0;
		int result = 0;
		try {
			result = num1 / num2;
			System.out.println("The result is: " + result);
			for (int i = 2; i >= 0; i--) {
				System.out.println("The value of array is: " + array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array is out of Bounds " + e);

		} finally {
			System.out.println("Here we proceed!");
		}
		for(int i=1; i<=5; i++) {
		System.out.println("Next steps");
		}
	}
}