package argparser;


public class Parser {

	private String _raw;


	private Parser(String value) {
		_raw = value;
	}
	


	public String GetRawData() {
		return _raw;
	}
	
	

	public static Parser Parse(String value) throws Exception {
		if (value == null) {
			throw new Exception("value cannot be null");
		}

		return new Parser(value);
	}
}
