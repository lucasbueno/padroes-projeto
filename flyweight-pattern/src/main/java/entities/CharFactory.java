package entities;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {
	private static Map<String, SingleChar> chars;

	private static void init() {
		chars = new HashMap<String, SingleChar>();
		chars.put("a", new SingleChar("a"));
		chars.put("b", new SingleChar("b"));
		chars.put("c", new SingleChar("c"));
	}

	public static SingleChar get(String c) {
		if (chars == null)
			init();
		return chars.get(c);
	}
}
