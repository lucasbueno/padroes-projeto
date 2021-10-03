import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Aluno lucas = new Aluno("Lucas", "1");
		Professor bueno = new Professor("Bueno", "2");
		Disciplina padroes = new Disciplina("Padrões de Projeto", 20, bueno);
		List<Double> notas = new ArrayList<Double>();
		List<Double> ponderacoes = new ArrayList<Double>();
		notas.add(8.0);
		notas.add(7.0);
		notas.add(4.0);
		ponderacoes.add(0.3);
		ponderacoes.add(0.3);
		ponderacoes.add(0.4);
		
		ResultadoDoAluno mediaSimples = new ResultadoDoAluno(lucas, padroes, notas, 20, new MediaSimples());
		ResultadoDoAluno mediaPonderada = new ResultadoDoAluno(lucas, padroes, notas, 20, new MediaPonderada(ponderacoes));

		System.out.println("Média simples: " + mediaSimples.calcularNotaFinal());
		System.out.println("Média ponderada: " + mediaPonderada.calcularNotaFinal());
		
	}
}
