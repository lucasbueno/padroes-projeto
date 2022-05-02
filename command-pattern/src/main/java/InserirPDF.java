
public class InserirPDF implements Comando {
	private String documento;
	private String localPDF;

	public InserirPDF(String documento, String localImagem) {
		super();
		this.documento = documento;
		this.localPDF = localImagem;
	}

	public String fazer() {
		return documento.concat("PDF=[" + localPDF + "]");
	}

	public String desfazer() {
		return documento;
	}

}
