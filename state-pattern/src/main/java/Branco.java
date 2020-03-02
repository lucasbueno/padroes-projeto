import java.util.List;

public class Branco extends Cor {
	public void busca(No no, List<No> visitados) {
		no.setCor(new Cinza(), visitados);
	}
}