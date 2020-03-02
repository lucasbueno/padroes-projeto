import java.util.List;

public class Cinza extends Cor {
	public void assumiu(No no, List<No> visitados) {
		for (No adj : no.getAdjacentes())
			adj.buscaProfundidade(visitados);
		no.setCor(new Preto(), visitados);
	}
}
