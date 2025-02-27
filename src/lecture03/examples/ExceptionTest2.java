package lecture03.examples;

// Copyright: http://www.tutorialspoint.com/

public class ExceptionTest2 {

	public static void main(String args[]) {
		int a[] = new int[2];
		try {
			System.out.println("Access element three: " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}
}