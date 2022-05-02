
public class Main {

	public static void main(String[] args) {
		Role admin = new Role().isNamed("Administrator");
		Person lucas = new Person().isNamed("Lucas").isBornedOn("06/06/06").is(admin);
	}

}
