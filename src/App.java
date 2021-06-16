import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
		if (args == null) {
			System.out.println("no arguments are provided!");
			return;
		} else if (args.length == 0) {
			JOptionPane.showMessageDialog(null, "Onii-chan!");
			throw new SomeException("tets");
		}
		var str = "args: ";
		for (var current : args) {
			str += "\n" + current;
		}

        System.out.println("Hello, World!" + str);
		
    }

	public static class SomeException extends Exception {
		public SomeException(String text) {
			super("A new exception is here waiting for ya: " + text);
		}
	}
}

