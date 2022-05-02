
public class Person {
	private String name;
	private String birthDate;
	private Role role;

	public Person isNamed(String name) {
		this.name = name;
		return this;
	}

	public Person isBornedOn(String birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public Person is(Role role) {
		this.role = role;
		return this;
	}

	public String named() {
		return name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public Role getRole() {
		return role;
	}

}
