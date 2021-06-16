package utilities;
import exceptions.ArgumentException;
import exceptions.ArgumentNullException;


public class WotoVersion {

	private final String _version;


	public WotoVersion(String verValue) throws ArgumentException {
		if (verValue == null) {
			throw new ArgumentNullException("verValue");
		}
		
		if (verValue.length() == 0) {
			throw new ArgumentException("verValue's length cannot be zero");
		}

		_version = verValue;
	}

	public String getVersion() {
		return _version;
	}
}

