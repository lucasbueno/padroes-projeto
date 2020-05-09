
public class Person {
	private String name;
	private String birthDate;
	private Role role;

	public Person named(String name) {
		this.name = name;
		return this;
	}

	public Person bornedOn(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public Person is(Role role) {
		this.role = role;
		return this;
	}
}
