package lecture03.examples;

public class NeverCaught2 {
	static void f() throws RuntimeException {
		throw new RuntimeException("From f()");
	}

	static void g() throws RuntimeException {
		f();
	}

	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("We have a problem!");
			System.out.println(e.toString());
		}
	}
}
