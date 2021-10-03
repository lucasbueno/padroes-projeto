import java.util.List;

public class MediaPonderada implements InterfaceCalculoNotaFinal {

	private List<Double> ponderacoes;

	public MediaPonderada(List<Double> ponderacoes) {
		super();
		this.ponderacoes = ponderacoes;
	}

	public double calcular(List<Double> notas) {
		double resultado = 0;
		for(int indiceNota = 0; indiceNota < notas.size(); indiceNota++) {
			resultado += notas.get(indiceNota) * ponderacoes.get(indiceNota);
		}
		return resultado;
	}

}
