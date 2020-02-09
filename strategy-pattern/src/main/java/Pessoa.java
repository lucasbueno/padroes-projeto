
public abstract class Pessoa {
	private String nome;
	private String matricula;

	public Pessoa(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
