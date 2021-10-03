import java.util.List;

public class MediaSimples implements InterfaceCalculoNotaFinal{
	public double calcular(List<Double> notas) {
		double resultado = 0;
		for(Double nota : notas) {
			resultado += nota;
		}
		resultado = resultado / notas.size();
		return resultado;
	}
}
