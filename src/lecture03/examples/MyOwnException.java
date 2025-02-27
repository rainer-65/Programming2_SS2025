package lecture03.examples;

// see http://beginnersbook.com/2013/04/throw-in-java/

public class MyOwnException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MyOwnException(String msg) {
		super(msg);
	}
}