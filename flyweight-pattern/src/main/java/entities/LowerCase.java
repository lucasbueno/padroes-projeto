package entities;

public class LowerCase implements MyString {
	private MyString string;

	public LowerCase(MyString string) {
		this.string = string;
	}

	public String getString() {
		return string.getString().toLowerCase();
	}
}
