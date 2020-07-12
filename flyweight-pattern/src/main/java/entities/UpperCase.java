package entities;

public class UpperCase implements MyString {
	private MyString string;

	public UpperCase(MyString string) {
		this.string = string;
	}

	public String getString() {
		return string.getString().toUpperCase();
	}
}
