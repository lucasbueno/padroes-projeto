
public class Main {

	public static void main(String[] args) {
		Role admin = new Role().named("Administrator");
		Person lucas = new Person().named("Lucas").bornedOn("06/06/06").is(admin);
	}

}
