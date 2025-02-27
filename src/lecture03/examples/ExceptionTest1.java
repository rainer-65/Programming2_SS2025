package lecture03.examples;

// Copyright: http://www.tutorialspoint.com/

public class ExceptionTest1 {

	public static void main(String args[]) {
		int a[] = new int[2];
		try {
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		System.out.println("Out of the block");
	}
}
