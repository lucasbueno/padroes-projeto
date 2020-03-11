import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {
	private Set<No> adjacentes = new HashSet<>();
	private Cor cor;
	private String name;

	public No(String name) {
		this.name = name;
		cor = new Branco();
	}

	public void buscaProfundidade(List<No> list) {
		cor.busca(this, list);
	}

	public Set<No> getAdjacentes() {
		return adjacentes;
	}

	public void addAdjacente(No adj) {
		adjacentes.add(adj);
	}

	public void setCor(Cor cor, List<No> list) {
		this.cor = cor;
		cor.assumiu(this, list);
	}

	public String toString() {
		return name;
	}
}