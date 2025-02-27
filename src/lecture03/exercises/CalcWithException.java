package lecture03.exercises;

public class CalcWithException {
	public static void main(String[] args) {
		for (int i = -5; i < 5; i++) {
			try {
				System.out.println(60 / i);
			} catch (ArithmeticException e) {
				System.out.println("***Error occured***");
				System.out.println("Cause: " + e.getMessage());
				System.out.println("Exception Type: " + e.toString());
				System.out.print("Where:");
				e.printStackTrace();
			}
		}
	}
}