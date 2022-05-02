package entities;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {
	private static Map<String, MyString> chars;

	private static void init() {
		chars = new HashMap<String, MyString>();
	}

	public static MyString get(String c) {
		if (chars == null)
			init();
		MyString result = chars.get(c);
		if(result == null)
			chars.put(c, new SingleChar(c));
		return chars.get(c);
	}
}
