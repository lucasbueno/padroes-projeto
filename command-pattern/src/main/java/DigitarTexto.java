
public class DigitarTexto implements Comando {
	private String documento;
	private String adicionar;

	public DigitarTexto(String documento, String adicionar) {
		super();
		this.documento = documento;
		this.adicionar = adicionar;
	}

	public String fazer() {
		return documento.concat(adicionar);
	}

	public String desfazer() {
		return documento;
	}

}
