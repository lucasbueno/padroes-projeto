
public class Main {

	public static void main(String[] args) {
		String doc = "";
		ExecutorComandos exec = new ExecutorComandos();

		doc = exec.fazer(new DigitarTexto(doc, "teste "));
		System.out.println("1 - " + doc);

		doc = exec.fazer(new InserirImagem(doc, "c:\\users\\lucas\\foto.jpeg"));
		System.out.println("2 - " + doc);

		doc = exec.fazer(new DigitarTexto(doc, " funcionou "));
		System.out.println("3 - " + doc);

		doc = exec.desfazer();
		System.out.println("4 - " + doc);

		doc = exec.desfazer();
		System.out.println("5 - " + doc);

		doc = exec.desfazer();
		System.out.println("6 - " + doc);

		doc = exec.refazer();
		System.out.println("7 - " + doc);
	}

}
