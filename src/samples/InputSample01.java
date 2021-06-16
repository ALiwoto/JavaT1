package samples;

import javax.swing.JOptionPane;

import exceptions.ArgumentException;
import exceptions.ArgumentNullException;
import interfaces.Versionable;
import interfaces.Samplable;
import utilities.WotoVersion;

public class InputSample01 
implements Versionable, Samplable {
	//-----------------------------------------------------
	//#region final fields Region
	/** the version field of this sample */
	private final WotoVersion _version;
	//#endregion
	//-----------------------------------------------------
	//#region private field's Region
	/** first string entered by user */
	String firstNumber;
	/** second string entered by user */
	String secondNumber; 
	/** first number to add */
	int number1;
	/** second number to add */
	int number2;
	/** sum of number1 and number2 */
	int sum;
	//#endregion
	//-----------------------------------------------------
	//#region Constructor's Region
	public InputSample01(WotoVersion version) throws ArgumentException {
		if (version == null) {
			throw new ArgumentNullException("version");
		}
		
		_version = version;
	}
	//#endregion
	//-----------------------------------------------------
	//#region overrided methods' Region
	@Override 
	public WotoVersion getVersion() {
		return _version;
	}
	
	@Override
	public void RunSample() throws Exception {
		firstNumber =
		JOptionPane.showInputDialog( "Enter first integer" );
		// read in second number from user as a String
		secondNumber =
		JOptionPane.showInputDialog( "Enter second integer" );
		// convert numbers from type String to type int
		number1 = Integer.parseInt( firstNumber );
		number2 = Integer.parseInt( secondNumber );
		// add the numbers
		sum = number1 + number2;
		// display the results
		JOptionPane.showMessageDialog(
			null, "The sum is " + sum, "Results",
			JOptionPane.PLAIN_MESSAGE );
	}
	//#endregion
	//-----------------------------------------------------		
}
	