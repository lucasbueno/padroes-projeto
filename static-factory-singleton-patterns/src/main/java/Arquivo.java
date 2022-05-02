import java.util.logging.Logger;

public class Arquivo {
	private String nome;
	private String extensao;
	private String conteudo;
	private static Arquivo arquivo;

	private Arquivo() {

		Logger logger = Logger.getLogger("meu logger");
	}

	public static Arquivo criaNome(String nome) {
		if (arquivo != null) {
			arquivo.setNome(nome);
			return arquivo;
		}

		if (!valida(nome))
			return null;
		Arquivo a = new Arquivo();
		a.setNome(nome);
		return a;
	}

	public static Arquivo criaNomeExtensao(String nome, String extensao) {
		if (arquivo != null) {
			arquivo.setNome(nome);
			arquivo.setExtensao(extensao);
			return arquivo;
		}

		if (!valida(nome))
			return null;
		if (!valida(extensao))
			return null;
		Arquivo a = new Arquivo();
		a.setConteudo("");
		a.setExtensao(extensao);
		a.setNome(nome);
		return a;
	}

	public static Arquivo criaNomeConteudo(String nome, String conteudo) {
		if (arquivo != null) {
			arquivo.setNome(nome);
			arquivo.setConteudo(conteudo);
			return arquivo;
		}

		if (!valida(nome))
			return null;
		Arquivo a = new Arquivo(nome);
		a.setConteudo(conteudo);
		return a;
	}

	public static Arquivo cria(String nome, String extensao, String conteudo) {
		if (arquivo != null) {
			arquivo.setNome(nome);
			arquivo.setExtensao(extensao);
			arquivo.setConteudo(conteudo);
			return arquivo;
		}

		if (!valida(nome))
			return null;
		if (!valida(extensao))
			return null;
		return new Arquivo(nome, extensao, conteudo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!valida(nome))
			return;
		this.nome = nome;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		if (!valida(extensao))
			return;
		this.extensao = extensao;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	private static boolean valida(String texto) {
		return !texto.contains(" ");
	}

}
