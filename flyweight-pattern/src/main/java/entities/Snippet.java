package entities;

import java.util.ArrayList;
import java.util.List;

public class Snippet implements MyString {
	private List<MyString> myStrings;

	public Snippet() {
		this.myStrings = new ArrayList<MyString>();
	}

	public void add(MyString e) {
		myStrings.add(e);
	}

	public String getString() {
		String string = new String();
		for (MyString c : myStrings)
			string = string.concat(c.getString());
		return string;
	}
}
