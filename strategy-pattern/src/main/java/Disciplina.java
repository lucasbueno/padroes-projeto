
public class Disciplina {
	private String nome;
	private int numeroAulas;
	private Professor professor;

	public Disciplina(String nome, int numeroAulas, Professor professor) {
		super();
		this.nome = nome;
		this.numeroAulas = numeroAulas;
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroAulas() {
		return numeroAulas;
	}

	public Professor getProfessor() {
		return professor;
	}

}
