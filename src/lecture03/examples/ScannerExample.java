package lecture03.examples;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		String input;
		int number;

		Scanner in = new Scanner(System.in);

		// Solution 1
		for (int i = 1; i <= 10; i++) {
		System.out.print("Please Enter an Integer:\t");
		input = in.nextLine();
		number = Integer.parseInt(input);
		System.out.println("Your Input was:\t" + number);
		}

		in.close(); // Resource Closed

		// Solution 2
		// for (int i = 1; i <= 10; i++) {
		// System.out.print("Please Enter an Integer:\t");
		// number = in.nextInt();
		// System.out.println("Your Input was:\t" + number);
		// }

		// in.close(); // Resource Closed

	}

}