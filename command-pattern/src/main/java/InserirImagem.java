
public class InserirImagem implements Comando {
	private String documento;
	private String localImagem;

	public InserirImagem(String documento, String localImagem) {
		super();
		this.documento = documento;
		this.localImagem = localImagem;
	}

	public String fazer() {
		return documento.concat("IMAGEM=[" + localImagem + "]");
	}

	public String desfazer() {
		return documento;
	}
}
