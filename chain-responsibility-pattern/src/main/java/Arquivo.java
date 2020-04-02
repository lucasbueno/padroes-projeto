
public class Arquivo {
	private String nome;
	private String conteudo;

	public Arquivo(String nome, String conteudo) {
		super();
		this.nome = nome;
		this.conteudo = conteudo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
