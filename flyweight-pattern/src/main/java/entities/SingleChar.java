package entities;

public class SingleChar implements MyString {
	private final String character;

	protected SingleChar(String character) {
		this.character = character;
	}

	public String getString() {
		return character;
	}
}
