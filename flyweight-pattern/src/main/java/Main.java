import entities.CharFactory;
import entities.LowerCase;
import entities.MyString;
import entities.Snippet;
import entities.UpperCase;

public class Main {

	public static void main(String[] args) {
		Snippet aaa = new Snippet();
		aaa.add(CharFactory.get("a"));
		aaa.add(CharFactory.get("a"));
		aaa.add(CharFactory.get("a"));
		System.out.println(aaa.getString());

		Snippet aaab = new Snippet();
		aaab.add(aaa);
		aaab.add(CharFactory.get("b"));
		System.out.println(aaab.getString());
		

		MyString AAAB = new UpperCase(aaab);
		System.out.println(AAAB.getString());

		MyString A = new LowerCase(AAAB);
		System.out.println(A.getString());

	}

}
