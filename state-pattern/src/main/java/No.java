import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {
	private Set<No> adjacentes = new HashSet<>();
	private Cor cor;
	private String name;

	public Set<No> getAdjacentes() {
		return adjacentes;
	}

	public void addAdjacente(No adj) {
		adjacentes.add(adj);
	}

	public No(String name) {
		this.name = name;
		cor = new Branco();
	}

	public void buscaProfundidade(List<No> list) {
		cor.busca(this, list);
	}

	public void setCor(Cor cor, List<No> list) {
		this.cor = cor;
		cor.assumiu(this, list);
	}

	@Override
	public String toString() {
		return name;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		No other = (No) obj;
		if (adjacentes == null) {
			if (other.adjacentes != null)
				return false;
		} else if (!adjacentes.equals(other.adjacentes))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}