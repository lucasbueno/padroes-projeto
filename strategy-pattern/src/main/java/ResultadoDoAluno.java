import java.util.List;

public class ResultadoDoAluno {
	private Aluno aluno;
	private Disciplina disciplina;
	private List<Double> notas;
	private int numeroPresencas;
	private InterfaceCalculoNotaFinal calculoNotaFinal;

	public ResultadoDoAluno(Aluno aluno, Disciplina disciplina, List<Double> notas, int numeroPresencas,
			InterfaceCalculoNotaFinal calculoNotaFinal) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.notas = notas;
		this.numeroPresencas = numeroPresencas;
		this.calculoNotaFinal = calculoNotaFinal;
	}

	public double calcularNotaFinal() {
		return calculoNotaFinal.calcular(notas);
	}

	public int getNumeroPresencas() {
		return numeroPresencas;
	}

	public void setNumeroPresencas(int numeroPresencas) {
		this.numeroPresencas = numeroPresencas;
	}

	public InterfaceCalculoNotaFinal getCalculoNotaFinal() {
		return calculoNotaFinal;
	}

	public void setCalculoNotaFinal(InterfaceCalculoNotaFinal calculoNotaFinal) {
		this.calculoNotaFinal = calculoNotaFinal;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public List<Double> getNotas() {
		return notas;
	}

}
