public class App {
    public static void main(String[] args) throws SomeException {

		throw new SomeException();
        System.out.println("Hello, World!");
    }

	public class SomeException extends Exception {
		
	}
}

