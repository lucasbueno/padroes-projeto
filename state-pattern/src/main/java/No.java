import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {
	private Set<No> adjacentes = new HashSet<>();
	private Cor cor;
	private String name;

	public No(String name) {
		this.name = name;
		this.setCor(new Branco());
	}

	public List<No> buscaProfundidade() {
		List<No> resultado = new ArrayList<>();
		cor.busca(this, resultado);
		return resultado;
	}
	
	public List<No> buscaProfundidade(List<No> visitados) {
		cor.busca(this, visitados);
		return visitados;
	}

	public Set<No> getAdjacentes() {
		return adjacentes;
	}

	public void addAdjacente(No adj) {
		adjacentes.add(adj);
	}

	public void setCor(Cor cor) {
		this.cor = cor;
		cor.assumiu(this, new ArrayList<No>());
	}

	public void setCor(Cor cor, List<No> visitados) {
		this.cor = cor;
		cor.assumiu(this, visitados);
	}

	public String toString() {
		return name;
	}
}