import samples.InputSample01;
import utilities.WotoVersion;

public class App {
	private static final String VERSION =
	 "ver 0.0.1";
    public static void main(String[] args) throws Exception {
		var currentVer = new WotoVersion(VERSION);
		var inpSample = new InputSample01(currentVer);
		try {
			inpSample.RunSample();
		} catch (Exception e) {
			System.out.println("an error is here: \n" + 
			e.toString());
			
			System.exit(0x085);
		}
		
		System.exit(0x0);
    }

	public static class SomeException extends Exception {
		public SomeException(String text) {
			super("A new exception is here waiting for ya: " + text);
		}
	}
}

