package entities;

import java.util.ArrayList;
import java.util.List;

public class Snippet implements MyString {
	private List<MyString> chars;

	public Snippet() {
		this.chars = new ArrayList<MyString>();
	}

	public void add(MyString e) {
		chars.add(e);
	}

	public String getString() {
		String string = new String();
		for (MyString c : chars)
			string = string.concat(c.getString());
		return string;
	}
}
